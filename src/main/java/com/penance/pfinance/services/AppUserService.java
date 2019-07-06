package com.penance.pfinance.services;

import com.penance.pfinance.api.v1.DTO.AppUserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppUserService {

    List<AppUserDTO> getAllAppUsers();

    AppUserDTO getAppUserById(Long id);

    AppUserDTO createNewAppUser(AppUserDTO appUserDTO);

    AppUserDTO saveAppUserByDTO(Long id, AppUserDTO appUserDTO);

    AppUserDTO patchAppUser(Long id, AppUserDTO appUserDTO);

    void deleteAppUserById(Long id);

}
