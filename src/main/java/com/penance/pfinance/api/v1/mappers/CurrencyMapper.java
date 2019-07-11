package com.penance.pfinance.api.v1.mappers;

import com.penance.pfinance.api.v1.DTO.CurrencyDTO;
import com.penance.pfinance.model.Currency;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CurrencyMapper {

    CurrencyMapper INSTANCE = Mappers.getMapper(CurrencyMapper.class);

    CurrencyDTO currencyToCurrencyDTO(Currency currency);

    Currency currencyDTOToCurrency(CurrencyDTO currencyDTO);
}
