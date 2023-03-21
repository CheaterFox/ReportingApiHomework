package com.example.guardian.services.concretes;

import com.example.guardian.constants.ApiPathValues;
import com.example.guardian.constants.RestURLs;
import com.example.guardian.converters.TransactionListConverter;
import com.example.guardian.dto.TransactionListDto;
import com.example.guardian.modals.transactionlist.TransactionList;
import com.example.guardian.modals.transactionlist.TransactionListRequestBody;
import com.example.guardian.resources.TransactionListResponse;
import com.example.guardian.services.abstracts.TokenService;
import com.example.guardian.services.abstracts.TransactionListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class TransactionListServiceImpl implements TransactionListService {

    private Logger logger = LoggerFactory.getLogger(TransactionListServiceImpl.class);
    private final TokenService tokenService;
    private final TransactionListConverter transactionListConverter;

    public TransactionListServiceImpl(final TokenService tokenService, final TransactionListConverter transactionListConverter) {
        this.tokenService = tokenService;
        this.transactionListConverter = transactionListConverter;
    }
    @Override
    public TransactionListResponse  queryTransactionList(TransactionListDto transactionListDto, Optional<Integer> page) {
        final RestTemplate restTemplate = new RestTemplate();
        final HttpHeaders headers = new HttpHeaders();
        final String token = tokenService.getToken();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", token);
        final String LocalTransactionListURL = ApiPathValues.LOCAL_API + ApiPathValues.REQUEST_BASE + "/" + ApiPathValues.TRANSACTION_LIST;
        if(transactionListDto.getPage() == null && page.isPresent()) {
            transactionListDto.setPage(page.get());
        }
        final HttpEntity<TransactionListRequestBody> transactionListRequestBody =
                new HttpEntity<>(
                        new TransactionListRequestBody(
                                transactionListDto.getFromDate(), transactionListDto.getToDate(),
                                transactionListDto.getStatus(), transactionListDto.getOperation(),
                                transactionListDto.getMerchantId(), transactionListDto.getAcquirerId(),
                                transactionListDto.getPaymentMethod(), transactionListDto.getErrorCode(),
                                transactionListDto.getFilterField(), transactionListDto.getFilterValue(),
                                transactionListDto.getPage()), headers);
        final ResponseEntity<TransactionList> transactionListResponseEntity =
                restTemplate
                        .exchange(RestURLs.TRANSACTION_LIST_URL,
                                HttpMethod.POST,
                                transactionListRequestBody,
                                TransactionList.class);

        final TransactionList transactionList = Optional.ofNullable(transactionListResponseEntity.getBody())
                .orElseGet(TransactionList::new);
        final TransactionListResponse transactionListResponse = transactionListConverter.convertTransactionList(transactionList);
        if(transactionListResponse.getNext_page_url() != null) {
            transactionListResponse.setNext_page_url(
                    LocalTransactionListURL + transactionListResponse.getNext_page_url().substring(
                            transactionListResponse.getNext_page_url().indexOf("?")));
        }
        if (transactionListResponse.getPrev_page_url() != null) {
            transactionListResponse.setPrev_page_url(
                    LocalTransactionListURL + transactionListResponse.getPrev_page_url().substring(
                            transactionListResponse.getPrev_page_url().indexOf("?")
                    ));
        }
        logger.info("Transaction List consumed successfully");
        return transactionListResponse;
    }
}
