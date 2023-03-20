package com.example.guardian.modals.transactionreport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TransactionReportRequestBody {

    private String fromDate;
    private String toDate;
    private int merchant;
    private int acquirer;
}
