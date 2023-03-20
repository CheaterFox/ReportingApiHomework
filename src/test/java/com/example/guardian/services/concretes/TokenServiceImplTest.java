package com.example.guardian.services.concretes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenServiceImplTest {

    private final TokenServiceImpl tokenService = new TokenServiceImpl();

    @Test
    void getToken() {
        String token = tokenService.getToken();
        assertNotNull(token);
        assertTrue(token.length() > 0);
    }
}
