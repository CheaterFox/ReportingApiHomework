package com.example.guardian.services.abstracts;

import com.example.guardian.resources.ClientResponse;

public interface ClientService {

    ClientResponse queryClient(final String transactionId);
}
