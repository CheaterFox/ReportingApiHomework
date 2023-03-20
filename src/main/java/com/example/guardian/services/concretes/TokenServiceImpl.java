package com.example.guardian.services.concretes;

import com.example.guardian.constants.RestURLs;
import com.example.guardian.modals.token.LoginRequestBody;
import com.example.guardian.modals.token.Token;
import com.example.guardian.services.abstracts.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class TokenServiceImpl implements TokenService {

    private Logger logger = LoggerFactory.getLogger(TokenServiceImpl.class);
    public static final String EMAIL = "demo@financialhouse.io";
    public static final String PASSWORD = "cjaiU8CV";

    public String getToken() {
        final RestTemplate restTemplate = new RestTemplate();
        final HttpEntity<LoginRequestBody> loginRequestBody = new HttpEntity<>(
                new LoginRequestBody(EMAIL, PASSWORD));
        final ResponseEntity<Token> tokenResponseEntity =
                restTemplate
                        .exchange(RestURLs.LOGIN_URL,
                                HttpMethod.POST,
                                loginRequestBody,
                                Token.class);
        final String token = Optional.ofNullable(tokenResponseEntity.getBody())
                .map(Token::getToken)
                .orElseThrow(() -> new RuntimeException("Did not find token!!!"));
        logger.info("JWT Token taken successfully");
        return token;
    }
}
