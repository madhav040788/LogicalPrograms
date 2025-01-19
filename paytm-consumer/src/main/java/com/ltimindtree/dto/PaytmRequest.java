package com.ltimindtree.dto;

import lombok.Data;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class PaytmRequest<T> {
    private T payLoad;

    public T getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(T payLoad) {
        this.payLoad = payLoad;
    }

    public PaytmRequest(T payLoad) {
        this.payLoad = payLoad;
    }

    public PaytmRequest() {
    }
}
