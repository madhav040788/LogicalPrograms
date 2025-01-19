package com.ltimindtree.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {

    private String transactionId;
    private String srcAcc;
    private String destAcc;
    private double amount;
    private Date txDate;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSrcAcc() {
        return srcAcc;
    }

    public void setSrcAcc(String srcAcc) {
        this.srcAcc = srcAcc;
    }

    public String getDestAcc() {
        return destAcc;
    }

    public void setDestAcc(String destAcc) {
        this.destAcc = destAcc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public PaymentRequest(String transactionId, String srcAcc, String destAcc, double amount, Date txDate) {
        this.transactionId = transactionId;
        this.srcAcc = srcAcc;
        this.destAcc = destAcc;
        this.amount = amount;
        this.txDate = txDate;
    }

}
