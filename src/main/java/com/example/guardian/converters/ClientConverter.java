package com.example.guardian.converters;

import com.example.guardian.modals.client.CustomerInfoModel;
import com.example.guardian.resources.ClientResponse;
import org.springframework.stereotype.Component;

@Component
public class ClientConverter {

    public ClientResponse convertClient(final CustomerInfoModel customerInfoModel) {
        final ClientResponse clientResponse = new ClientResponse(
                customerInfoModel.getId(),
                customerInfoModel.getCreated_at(),
                customerInfoModel.getUpdated_at(),
                customerInfoModel.getDeleted_at(),
                customerInfoModel.getNumber(),
                customerInfoModel.getExpiryMonth(),
                customerInfoModel.getExpiryYear(),
                customerInfoModel.getStartMonth(),
                customerInfoModel.getStartYear(),
                customerInfoModel.getIssueNumber(),
                customerInfoModel.getEmail(),
                customerInfoModel.getBirthday(),
                customerInfoModel.getGender(),
                customerInfoModel.getBillingTitle(),
                customerInfoModel.getBillingFirstName(),
                customerInfoModel.getBillingLastName(),
                customerInfoModel.getBillingCompany(),
                customerInfoModel.getBillingAddress1(),
                customerInfoModel.getBillingAddress2(),
                customerInfoModel.getBillingCity(),
                customerInfoModel.getBillingPostcode(),
                customerInfoModel.getBillingState(),
                customerInfoModel.getBillingCountry(),
                customerInfoModel.getBillingPhone(),
                customerInfoModel.getBillingFax(),
                customerInfoModel.getShippingTitle(),
                customerInfoModel.getShippingFirstName(),
                customerInfoModel.getShippingLastName(),
                customerInfoModel.getShippingCompany(),
                customerInfoModel.getShippingAddress1(),
                customerInfoModel.getShippingAddress2(),
                customerInfoModel.getShippingCity(),
                customerInfoModel.getShippingPostcode(),
                customerInfoModel.getShippingState(),
                customerInfoModel.getShippingCountry(),
                customerInfoModel.getShippingPhone(),
                customerInfoModel.getShippingFax(),
                customerInfoModel.getToken()
        );

        return clientResponse;
    }
}
