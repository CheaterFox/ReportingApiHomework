package com.example.guardian.loader;

import com.example.guardian.modals.transactionreport.TransactionReport;
import com.example.guardian.modals.transactionreport.TransactionReportDetail;

import java.util.ArrayList;
import java.util.List;

public class TransactionReportLoader {

    public static TransactionReport loadTransactionReport() {
        TransactionReport transactionReport = new TransactionReport();
        transactionReport.setStatus("APPROVED");
        transactionReport.setTransactionReportDetailList(loadTransactionReportDetailList());
        return transactionReport;
    }

    private static List<TransactionReportDetail> loadTransactionReportDetailList() {
        List<TransactionReportDetail> transactionReportDetailList = new ArrayList<>();
        TransactionReportDetail transactionReportDetail = new TransactionReportDetail();
        transactionReportDetail.setCount(283);
        transactionReportDetail.setTotal(28300);
        transactionReportDetail.setCurrency("USD");
        TransactionReportDetail transactionReportDetail2 = new TransactionReportDetail();
        transactionReportDetail2.setCount(280);
        transactionReportDetail2.setTotal(1636515);
        transactionReportDetail2.setCurrency("EUR");
        transactionReportDetailList.add(transactionReportDetail);
        transactionReportDetailList.add(transactionReportDetail2);
        return transactionReportDetailList;
    }
}
