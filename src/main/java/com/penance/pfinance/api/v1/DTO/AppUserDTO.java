package com.penance.pfinance.api.v1.DTO;

import lombok.Data;

@Data
public class AppUserDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String appUserUrl;
}
