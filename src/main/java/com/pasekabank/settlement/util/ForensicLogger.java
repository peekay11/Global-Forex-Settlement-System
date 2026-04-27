package com.pasekabank.settlement.util;

import java.math.BigDecimal;
import java.util.UUID;

public class ForensicLogger {
//    construct the data  needed

    private String TransectionId;
    private BigDecimal SourceCurrency;
    private BigDecimal TargetCurrency;
    private BigDecimal ExchangeRate;
    private BigDecimal Amount;


    public ForensicLogger(String sourceCur, String targetCur, BigDecimal rate, BigDecimal amount) {
        this.sourceCurrency = sourceCur;
        this.targetCurrency = targetCur;
        this.exchangeRate = rate;
        this.amount = amount;
    }

// synchronized is used to handle  same time method calling

public  synchronized String getTransactionId() {
    if (this.TransectionId == null) {
        this.TransectionId = UUID.randomUUID().toString();
        return TransectionId;
    }
    return TransectionId;
}
public BigDecimal getSourceCurrency() {
    return SourceCurrency;
}
public BigDecimal getTargetCurrency() {
    return TargetCurrency;
}
public BigDecimal getExchangeRate() {
    return ExchangeRate;
}
public BigDecimal getAmount() {
    return Amount;
}
public void setTransectionId(String TransectionId) {
    this.TransectionId = TransectionId;
}
public void setSourceCurrency(BigDecimal SourceCurrency) {
    this.SourceCurrency = SourceCurrency;
}
public void setTargetCurrency(BigDecimal TargetCurrency) {
    this.TargetCurrency = TargetCurrency;
}
public void setExchangeRate(BigDecimal ExchangeRate) {
    this.ExchangeRate = ExchangeRate;
}
public void setAmount(BigDecimal Amount) {
    this.Amount = Amount;
}


    public String toString() { // Changed to camelCase (Java standard)
        return "TransactionId: " + getTransactionId() + "\n" +
                "SourceCurrency: " + getSourceCurrency() + "\n" +
                "TargetCurrency: " + getTargetCurrency() + "\n" +
                "ExchangeRate: " + getExchangeRate() + "\n" +
                "Amount: " + getAmount();
    }



}
