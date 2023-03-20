package com.example.guardian.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClientResource {

    @JsonProperty("client")
    private ClientResponse clientResponse;

    public ClientResource(final ClientResponse clientResponse) {
        this.clientResponse = clientResponse;
    }

    @Override
    public String toString() {
        return "ClientResource{" +
                "clientResponse=" + clientResponse +
                '}';
    }
}
