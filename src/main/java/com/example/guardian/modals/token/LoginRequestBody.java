package com.example.guardian.modals.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LoginRequestBody {

    private String email;
    private String password;
}
