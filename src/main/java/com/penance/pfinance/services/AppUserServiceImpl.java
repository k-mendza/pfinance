package com.penance.pfinance.services;

import com.penance.pfinance.api.v1.DTO.AppUserDTO;
import com.penance.pfinance.api.v1.mappers.AppUserMapper;
import com.penance.pfinance.repositories.AppUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppUserServiceImpl implements AppUserService {

    private final AppUserMapper appUserMapper;
    private final AppUserRepository appUserRepository;

    public AppUserServiceImpl(AppUserMapper appUserMapper, AppUserRepository appUserRepository) {
        this.appUserMapper = appUserMapper;
        this.appUserRepository = appUserRepository;
    }


    @Override
    public List<AppUserDTO> getAllAppUsers() {
        return appUserRepository
                .findAll()
                .stream()
                .map(appUser -> {
                    AppUserDTO appUserDTO = appUserMapper.appUserToAppUserDTO(appUser);
                    appUserDTO.setAppUserUrl("/api/appuser/" + appUser.getId());
                    return appUserDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public AppUserDTO getAppUserById(Long id) {
        return null;
    }

    @Override
    public AppUserDTO createNewAppUser(AppUserDTO appUserDTO) {
        return null;
    }

    @Override
    public AppUserDTO saveAppUserByDTO(Long id, AppUserDTO appUserDTO) {
        return null;
    }

    @Override
    public AppUserDTO patchAppUser(Long id, AppUserDTO appUserDTO) {
        return null;
    }

    @Override
    public void deleteAppUserById(Long id) {

    }
}
