package com.example.guardian.services.concretes;

import com.example.guardian.converters.TransactionReportConverter;
import com.example.guardian.dto.TransactionReportDto;
import com.example.guardian.loader.TransactionReportLoader;
import com.example.guardian.modals.transactionreport.TransactionReport;
import com.example.guardian.resources.TransactionReportResponse;
import com.example.guardian.services.abstracts.TokenService;
import com.example.guardian.services.abstracts.TransactionReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionReportServiceImpl implements TransactionReportService {

    private Logger logger = LoggerFactory.getLogger(TransactionReportServiceImpl.class);
    private final TokenService tokenService;
    private final TransactionReportConverter transactionReportConverter;

    @Autowired
    public TransactionReportServiceImpl(final TokenService tokenService, final TransactionReportConverter transactionReportConverter) {
        this.tokenService = tokenService;
        this.transactionReportConverter = transactionReportConverter;
    }

    public TransactionReportResponse queryTransactionReport(final TransactionReportDto transactionReportDto) {
        /*
        final RestTemplate restTemplate = new RestTemplate();
        final HttpHeaders headers = new HttpHeaders();
        final String token = tokenService.getToken();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", token);
        final HttpEntity<TransactionReportRequestBody> transactionReportRequestBody = new HttpEntity<>(new TransactionReportRequestBody(transactionReportDto.getFromDate(), transactionReportDto.getToDate(),
                transactionReportDto.getMerchant(), transactionReportDto.getAcquirer()), headers);
        final ResponseEntity<TransactionReport> transactionReportResponseEntity =
                restTemplate
                        .exchange(RestURLs.TRANSACTION_REPORT_URL,
                                HttpMethod.POST,
                                transactionReportRequestBody,
                                TransactionReport.class);
        */

        //******************************************************************

        // From the given url from pdf .../api/v3/transactions/report (for get report by params) i get error message
        //  {
        //    "code": 9,
        //    "status": "DECLINED",
        //    "message": "10.72.23.66:27017: The 'cursor' option is required, except for aggregate with the explain argument"
        //  }
        // so i took the upper code in comment line
        // and loaded class with hardcoded below

        //******************************************************************

        final TransactionReport transactionReport = TransactionReportLoader.loadTransactionReport();
        final TransactionReportResponse transactionReportResponse = transactionReportConverter.convertTransactionReport(transactionReport);

        logger.info("Transaction Report consumed successfully");
        return transactionReportResponse;
    }
}
