package com.pasekabank.settlement.util;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.UUID;

public class ForensicLogger {
//    construct the data  needed

    private String TransectionId;
    private String SourceCurrency;
    private String TargetCurrency;
    private BigDecimal ExchangeRate;
    private BigDecimal Amount;


    public ForensicLogger(String sourceCur, String targetCur, BigDecimal rate, BigDecimal amount ) {
        this.SourceCurrency = sourceCur;
        this.TargetCurrency = targetCur;
        this.ExchangeRate = rate;
        this.Amount = amount;
    }

// synchronized is used to handle  same time method calling

public  synchronized String getTransactionId() {
    if (this.TransectionId == null) {
        this.TransectionId = UUID.randomUUID().toString();
        return TransectionId;
    }
    return TransectionId;
}
public String getSourceCurrency() {
    return SourceCurrency;
}
public String getTargetCurrency() {
    return TargetCurrency;
}
public BigDecimal getExchangeRate() {
    return ExchangeRate;
}


public LocalDateTime getDateTime(){

        return LocalDateTime.now();
}

public BigDecimal getAmount() {
    return Amount;
}
public void setTransectionId(String TransectionId) {
    this.TransectionId = TransectionId;
}
public void setSourceCurrency(String SourceCurrency) {
    this.SourceCurrency = SourceCurrency;

}
public void setTargetCurrency(String TargetCurrency) {
    this.TargetCurrency = TargetCurrency;
}
public void setExchangeRate(BigDecimal ExchangeRate) {
    this.ExchangeRate = ExchangeRate;
}
public void setAmount(BigDecimal Amount) {
    this.Amount = Amount;
}


    public String generateLOg() { // Changed to camelCase (Java standard)
        return "TransactionId: " + getTransactionId() + "\n" +
                "SourceCurrency: " + getSourceCurrency() + "\n" +
                "TargetCurrency: " + getTargetCurrency() + "\n" +
                "Date/Time :" + getDateTime() + "\n" +
                "ExchangeRate: " + getExchangeRate() + "\n" +
                "Amount: " + getAmount();
    }



}
