package com.penance.pfinance.controllers.v1;

import com.penance.pfinance.api.v1.DTO.TransactionDTO;
import com.penance.pfinance.controllers.RestResponseEntityExceptionHandler;
import com.penance.pfinance.services.ResourceNotFoundException;
import com.penance.pfinance.services.TransactionService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class TransactionControllerTest extends AbstractRestControllerTest{

    public static final Integer ID = 1;

    @Mock
    TransactionService transactionService;

    @InjectMocks
    TransactionController transactionController;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(transactionController)
                .setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();

    }

    @Test
    public void testListTransactions() throws Exception {
        TransactionDTO trans1 = new TransactionDTO();
        trans1.setId(1l);

        TransactionDTO trans2 = new TransactionDTO();
        trans2.setId(2l);

        List<TransactionDTO> transactions = Arrays.asList(trans1, trans2);

        when(transactionService.getAllTransactions()).thenReturn(transactions);

        mockMvc.perform(get(TransactionController.BASE_URL)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.transactions", hasSize(2)));
    }

    @Test
    public void testTransactionsGetById() throws Exception {
        TransactionDTO trans1 = new TransactionDTO();
        trans1.setId(1l);

        when(transactionService.getTransactionById(anyLong())).thenReturn(trans1);

        mockMvc.perform(get(TransactionController.BASE_URL)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", equalTo(ID)));
    }

    @Test
    public void createNewTransaction() throws Exception {

        //given
        TransactionDTO transaction = new TransactionDTO();
        transaction.setId(1L);
        transaction.setAmount((float) 99.99);


        TransactionDTO returnDTO = new TransactionDTO();
//        returnDTO.setTransactionUrl(TransactionController.BASE_URL + "/1");
        returnDTO.setAmount(transaction.getAmount());
        returnDTO.setId(transaction.getId());
        //when

        when(transactionService.createNewTransaction(transaction)).thenReturn(returnDTO);

        //then

        mockMvc.perform(post(TransactionController.BASE_URL)
            .contentType(MediaType.APPLICATION_JSON)
            .content(asJsonString(transaction)))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.id", equalTo(1)))
        .andExpect(jsonPath("$.amount", equalTo(99.99)))
        .andExpect(jsonPath("$.transactionUrl", equalTo(TransactionController.BASE_URL + "/1")));
    }

    @Test
    public void testGetByIdNotFound() throws Exception {
        when(transactionService.getTransactionById(anyLong())).thenThrow(ResourceNotFoundException.class);

        mockMvc.perform(get(TransactionController.BASE_URL + "/222")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}
