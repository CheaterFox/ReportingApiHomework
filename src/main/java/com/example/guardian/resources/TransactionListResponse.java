package com.example.guardian.resources;

import com.example.guardian.modals.transaction.TransactionModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
public class TransactionListResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = -444167704257484589L;

    private int per_page;
    private int current_page;
    private String next_page_url;
    private String prev_page_url;
    private int from;
    private int to;
    private List<TransactionModel> data;

    public TransactionListResponse(int per_page, int current_page, String next_page_url, String prev_page_url, int from, int to, List<TransactionModel> data) {
        this.per_page = per_page;
        this.current_page = current_page;
        this.next_page_url = next_page_url;
        this.prev_page_url = prev_page_url;
        this.from = from;
        this.to = to;
        this.data = data;
    }

    @Override
    public String toString() {
        return "TransactionListResponse{" +
                "per_page=" + per_page +
                ", current_page=" + current_page +
                ", next_page_url='" + next_page_url + '\'' +
                ", prev_page_url='" + prev_page_url + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", data=" + data +
                '}';
    }
}
