package com.example.guardian.loader;

import com.example.guardian.modals.acquirer.AcquirerModel;
import com.example.guardian.modals.client.CustomerInfoModel;
import com.example.guardian.modals.fx.FxModel;
import com.example.guardian.modals.ipn.IpnModel;
import com.example.guardian.modals.merchant.MerchantModel;
import com.example.guardian.modals.transaction.TransactionModel;
import com.example.guardian.modals.transactiondetail.TransactionDetailModel;

public class TransactionLoader {

    public static TransactionModel loadTransaction() {

        TransactionModel transactionModel = new TransactionModel();

        transactionModel.setFx(loadFx());
        transactionModel.setUpdated_at("2022-12-12");
        transactionModel.setCreated_at("2022-12-12");
        transactionModel.setRefundable(true);
        transactionModel.setCustomerInfo(loadCustomerInfo());
        transactionModel.setAcquirer(loadAcquirer());
        transactionModel.setMerchant(loadMerchant());
        transactionModel.setTransactionDetail(loadTransactionDetail());
        transactionModel.setIpn(loadIpn());

        return transactionModel;
    }

    private static IpnModel loadIpn() {
        IpnModel ipnModel = new IpnModel();
        ipnModel.setSent(true);
        ipnModel.setMerchant(loadMerchant());
        return ipnModel;
    }

    private static TransactionDetailModel loadTransactionDetail() {
        TransactionDetailModel transactionDetailModel = new TransactionDetailModel();
        transactionDetailModel.setMerchantTransaction(loadMerchant());
        return transactionDetailModel;
    }

    private static MerchantModel loadMerchant() {
        MerchantModel merchantModel = new MerchantModel();
        merchantModel.setId(100);
        merchantModel.setName("MM-Merchant");
        merchantModel.setAllowPartialRefund(true);
        merchantModel.setAllowPartialCapture(true);
        merchantModel.setReferenceNo("mmm_5a76f4343717adc");
        merchantModel.setStatus("APPROVED");
        merchantModel.setCustomData("43972-1517999431-981");
        merchantModel.setType("AUTH");
        merchantModel.setOperation("3DAUTH");
        merchantModel.setCreated_at("2020-10-10");
        merchantModel.setMessage("Approved");
        merchantModel.setTransactionId("437312-1543744439-43");
        merchantModel.setAmount(1000);
        merchantModel.setOriginalAmount(1000);
        merchantModel.setCurrency("TRY");
        merchantModel.setOriginalCurrency("TRY");
        merchantModel.setConvertedCurrency("TRY");
        merchantModel.setConvertedAmount(1000);
        merchantModel.setChainId("43a0c9d89bdc43");
        merchantModel.setPaymentType("PAYTOCARD");
        merchantModel.setToken("43mm6aa5e92209d4437823503f7e631cdd9243c418mmd640db6f6e4bbc34330mm");
        merchantModel.setIPNUrl("https://requestb.in/4343mm4343mm");
        merchantModel.setIpnType("MERCHANTIPN");
        merchantModel.setCode("4343");
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

    private static CustomerInfoModel loadCustomerInfo() {
        CustomerInfoModel customerInfoModel = new CustomerInfoModel();
        customerInfoModel.setId(100);
        customerInfoModel.setCreated_at("2021-01-01");
        customerInfoModel.setUpdated_at("2021-01-01");
        customerInfoModel.setNumber("434343434343");
        customerInfoModel.setEmail("mso@com");
        customerInfoModel.setBillingFirstName("Muhammed");
        customerInfoModel.setBillingLastName("OGUT");
        return customerInfoModel;
    }

    private static FxModel loadFx(){
        FxModel fxModel = new FxModel();
        fxModel.setFxMerchant(loadMerchant());
        return fxModel;
    }
}
