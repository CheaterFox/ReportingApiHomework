package com.example.guardian.converters;

import com.example.guardian.modals.transactionreport.TransactionReport;
import com.example.guardian.resources.TransactionReportResponse;
import org.springframework.stereotype.Component;

@Component
public class TransactionReportConverter {

    public TransactionReportResponse convertTransactionReport(final TransactionReport transactionReport) {
        TransactionReportResponse transactionReportResponse = new TransactionReportResponse(
                transactionReport.getStatus(),
                transactionReport.getTransactionReportDetailList()
        );

        return transactionReportResponse;
    }
}
