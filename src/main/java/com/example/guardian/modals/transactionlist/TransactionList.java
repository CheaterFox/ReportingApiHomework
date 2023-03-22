package com.example.guardian.modals.transactionlist;

import com.example.guardian.modals.transaction.TransactionModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TransactionList {

    private int per_page;
    private int current_page;
    private String next_page_url;
    private String prev_page_url;
    private int from;
    private int to;

    @JsonProperty("data")
    private List<TransactionModel> data;
}

