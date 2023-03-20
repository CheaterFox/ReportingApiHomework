package com.example.guardian.services.concretes;

import com.example.guardian.constants.RestURLs;
import com.example.guardian.converters.ClientConverter;
import com.example.guardian.modals.client.Client;
import com.example.guardian.modals.client.ClientRequestBody;
import com.example.guardian.modals.client.CustomerInfoModel;
import com.example.guardian.resources.ClientResponse;
import com.example.guardian.services.abstracts.ClientService;
import com.example.guardian.services.abstracts.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private Logger logger = LoggerFactory.getLogger(ClientServiceImpl.class);
    private final TokenService tokenService;
    private final ClientConverter clientConverter;

    @Autowired
    public ClientServiceImpl(final TokenService tokenService, final ClientConverter clientConverter) {
        this.tokenService = tokenService;
        this.clientConverter = clientConverter;
    }

    public ClientResponse queryClient(final String transactionId) {
        final RestTemplate restTemplate = new RestTemplate();
        final HttpHeaders headers = new HttpHeaders();
        final String token = tokenService.getToken();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", token);
        final HttpEntity<ClientRequestBody> clientRequestBody = new HttpEntity<>(new ClientRequestBody(transactionId), headers);
        final ResponseEntity<Client> clientResponseEntity =
                restTemplate
                        .exchange(RestURLs.CLIENT_URL,
                                HttpMethod.POST,
                                clientRequestBody,
                                Client.class);
        final CustomerInfoModel customerInfoModel = Optional.ofNullable(clientResponseEntity.getBody())
                .map(Client::getCustomerInfo)
                .orElse(null);

        if (customerInfoModel == null) {
            return null;
        }

        final ClientResponse clientResponse = clientConverter.convertClient(customerInfoModel);

        logger.info("Client consumed successfully");

        return clientResponse;
    }
}
