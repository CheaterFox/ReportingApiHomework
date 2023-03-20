package com.example.guardian.services.concretes;

import com.example.guardian.converters.TransactionConverter;
import com.example.guardian.loader.TransactionLoader;
import com.example.guardian.modals.transaction.TransactionModel;
import com.example.guardian.resources.TransactionResponse;
import com.example.guardian.services.abstracts.TokenService;
import com.example.guardian.services.abstracts.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    private Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class);
    private final TokenService tokenService;
    private final TransactionConverter transactionConverter;

    public TransactionServiceImpl(final TokenService tokenService, final TransactionConverter transactionConverter) {
        this.tokenService = tokenService;
        this.transactionConverter = transactionConverter;
    }

    public TransactionResponse queryTransaction(String transactionId) {
      /*  final RestTemplate restTemplate = new RestTemplate();
        final HttpHeaders headers = new HttpHeaders();
        final String token = tokenService.getToken();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", token);
        final HttpEntity<TransactionRequestBody> transactionRequestBody = new HttpEntity<>(new TransactionRequestBody(transactionId), headers);
        final ResponseEntity<Transaction> transactionResponseEntity =
                restTemplate
                        .exchange(RestURLs.TRANSACTION,
                                HttpMethod.POST,
                                transactionRequestBody,
                                Transaction.class);

        final Transaction transaction = transactionResponseEntity.getBody();
        final TransactionResponse transactionResponse = transactionConverter.convertTransaction(transaction);

        return transactionResponse; */

        //******************************************************************

        // From the given url(for get transaction by id) i get error message
        //  {
        //    "status": "DECLINED",
        //    "message": "The merchant has no permission to perform this operation!"
        //  }
        // that i do not have permission to see the results so i took the upper code in comment line
        // and loaded class with hardcoded below

        //******************************************************************

        final TransactionModel transactionModel = TransactionLoader.loadTransaction();
        final TransactionResponse transactionResponse = transactionConverter.convertTransaction(transactionModel);

        logger.info("Transaction consumed successfully");
        return transactionResponse;
    }
}
