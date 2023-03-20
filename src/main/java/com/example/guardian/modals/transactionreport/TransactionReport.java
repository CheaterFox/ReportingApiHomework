package com.example.guardian.modals.transactionreport;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class TransactionReport {

    private String status;
    private List<TransactionReportDetail> transactionReportDetailList;
}
