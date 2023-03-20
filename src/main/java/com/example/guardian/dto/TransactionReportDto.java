package com.example.guardian.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonTypeName("transactionReport")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
@Data
public class TransactionReportDto implements Serializable {

    private static final long serialVersionUID = 593885504185312035L;

    @NotNull
    @NotEmpty
    private String fromDate;
    @NotNull
    @NotEmpty
    private String toDate;
    private Integer merchant;
    private Integer acquirer;

    @Override
    public String toString() {
        return "TransactionReportDto{" +
                "fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", merchant=" + merchant +
                ", acquirer=" + acquirer +
                '}';
    }
}
