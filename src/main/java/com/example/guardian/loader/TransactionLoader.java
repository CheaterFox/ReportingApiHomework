package com.example.guardian.loader;

import com.example.guardian.modals.acquirer.AcquirerModel;
import com.example.guardian.modals.client.Client;
import com.example.guardian.modals.client.CustomerInfoModel;
import com.example.guardian.modals.fx.FxModel;
import com.example.guardian.modals.fx.FxMerchantModel;
import com.example.guardian.modals.merchant.MerchantModel;
import com.example.guardian.modals.merchanttransaction.MerchantTransactionModel;
import com.example.guardian.modals.transaction.TransactionModel;
import com.example.guardian.modals.transactiondetail.TransactionDetailModel;

public class TransactionLoader {


    public static TransactionModel loadTransaction() {

        TransactionModel transactionModel = new TransactionModel();

        transactionModel.setFx(loadFx());
        transactionModel.setClient(loadClient());
        transactionModel.setAcquirer(loadAcquirer());
        transactionModel.setMerchant(loadMerchant());
        transactionModel.setTransactionDetail(loadTransactionDetail());

        return transactionModel;
    }

    private static TransactionDetailModel loadTransactionDetail() {
        TransactionDetailModel transactionDetailModel = new TransactionDetailModel();
        transactionDetailModel.setMerchantTransaction(loadMerchantTransaction());
        return transactionDetailModel;
    }

    private static MerchantTransactionModel loadMerchantTransaction() {
        MerchantTransactionModel merchantTransactionModel = new MerchantTransactionModel();
        merchantTransactionModel.setReferenceNo("api_43434343");
        merchantTransactionModel.setId(100);
        merchantTransactionModel.setStatus("APPROVED");
        merchantTransactionModel.setOperation("DIRECT");
        merchantTransactionModel.setCreated_at("2022-01-10");
        return merchantTransactionModel;
    }

    private static MerchantModel loadMerchant() {
        MerchantModel merchantModel = new MerchantModel();
        merchantModel.setId(100);
        merchantModel.setName("MM-Merchant");
        return merchantModel;
    }

    private static AcquirerModel loadAcquirer() {
        AcquirerModel acquirerModel = new AcquirerModel();
        acquirerModel.setId(100);
        acquirerModel.setCode("MM");
        acquirerModel.setName("MM BANK");
        acquirerModel.setType("CREDITCARD");
        return acquirerModel;
    }

    private static Client loadClient() {
        Client client = new Client();
        client.setCustomerInfo(loadCustomerInfo());
        return client;
    }

    private static CustomerInfoModel loadCustomerInfo() {
        CustomerInfoModel customerInfoModel = new CustomerInfoModel();
        customerInfoModel.setId(100);
        customerInfoModel.setCreated_at("2023-01-01");
        customerInfoModel.setUpdated_at("2023-01-01");
        customerInfoModel.setNumber("434343434343");
        customerInfoModel.setEmail("mso@com");
        customerInfoModel.setBillingFirstName("Muhammed");
        customerInfoModel.setBillingLastName("OGUT");
        return customerInfoModel;
    }

    private static FxModel loadFx(){
       FxModel fxModel = new FxModel();
       fxModel.setFxMerchant(loadFxMerchant());
       return fxModel;
    }

    private static FxMerchantModel loadFxMerchant() {
        FxMerchantModel fxMerchantModel = new FxMerchantModel();
        fxMerchantModel.setOriginalAmount(100);
        fxMerchantModel.setOriginalCurrency("USD");
        fxMerchantModel.setConvertedAmount(100);
        fxMerchantModel.setConvertedCurrency("USD");
        return fxMerchantModel;
    }
}
