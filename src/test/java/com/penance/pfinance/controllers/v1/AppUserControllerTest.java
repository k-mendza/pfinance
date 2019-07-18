package com.penance.pfinance.controllers.v1;

import com.penance.pfinance.api.v1.DTO.AppUserDTO;
import com.penance.pfinance.controllers.RestResponseEntityExceptionHandler;
import com.penance.pfinance.services.AppUserService;
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

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class AppUserControllerTest extends AbstractRestControllerTest {

    @Mock
    AppUserService appUserService;

    @InjectMocks
    AppUserController appUserController;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(appUserController)
                .setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();

    }

    @Test
    public void testListAppUsers() throws Exception {
        AppUserDTO user1 = new AppUserDTO();
        user1.setId(1L);

        AppUserDTO user2 = new AppUserDTO();
        user2.setId(2L);

        List<AppUserDTO> appUsers = Arrays.asList(user1, user2);

        when(appUserService.getAllAppUsers()).thenReturn(appUsers);

        mockMvc.perform(get(AppUserController.BASE_URL)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.appUsers", hasSize(2)));
    }
}
