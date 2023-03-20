package com.example.guardian.resources;

import com.example.guardian.modals.transactionreport.TransactionReportDetail;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
public class TransactionReportResponse implements Serializable {

    private static final long serialVersionUID = 8062825863234750826L;

    private String status;
    private List<TransactionReportDetail> transactionReportDetailList;

    public TransactionReportResponse(String status, List<TransactionReportDetail> transactionReportDetailList) {
        this.status = status;
        this.transactionReportDetailList = transactionReportDetailList;
    }

    @Override
    public String toString() {
        return "TransactionReportResponse{" +
                "status='" + status + '\'' +
                ", transactionReportList=" + transactionReportDetailList +
                '}';
    }
}
