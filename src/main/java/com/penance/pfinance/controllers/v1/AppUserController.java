package com.penance.pfinance.controllers.v1;

import com.penance.pfinance.api.v1.DTO.AppUserDTO;
import com.penance.pfinance.services.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/appusers")
@CrossOrigin(origins = "http://localhost:4200")
public class AppUserController {

    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public ResponseEntity<List<AppUserDTO>> getAllAppUsers(){
        List<AppUserDTO> dtoList = appUserService.getAllAppUsers();
        return new ResponseEntity<>( dtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppUserDTO> getAppUserById(@PathVariable Long id){
        return new ResponseEntity<>(appUserService.getAppUserById(id), HttpStatus.OK);
    }
}
