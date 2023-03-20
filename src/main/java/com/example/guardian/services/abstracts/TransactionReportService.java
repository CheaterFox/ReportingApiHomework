package com.example.guardian.services.abstracts;

import com.example.guardian.dto.TransactionReportDto;
import com.example.guardian.resources.TransactionReportResponse;

public interface TransactionReportService {

    TransactionReportResponse queryTransactionReport(final TransactionReportDto transactionReportDto);
}
