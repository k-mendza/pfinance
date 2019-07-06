package com.penance.pfinance.api.v1.mappers;

import com.penance.pfinance.api.v1.DTO.AppUserDTO;
import com.penance.pfinance.model.AppUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AppUserMapper {

    AppUserMapper INSTANCE = Mappers.getMapper(AppUserMapper.class);

    AppUserDTO appUserToAppUserDTO(AppUser appUser);

    AppUser appUserDTOToAppUser(AppUserDTO appUserDTO);
}
