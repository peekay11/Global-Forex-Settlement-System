package com.pasekabank.settlement.service;

import java.math.BigDecimal;




public class ExchangeService {
    private BigDecimal exchangeRate;
    private BigDecimal initialAmount;


    public ExchangeService(BigDecimal exchangeRate, BigDecimal initialAmount) {

        this.exchangeRate = exchangeRate;
        this.initialAmount = initialAmount;

    }

    public BigDecimal getExchangeRate() {

        if  (exchangeRate == null) {
            throw new IllegalArgumentException("Exchange rate is cannot be null  ");
        }

        return exchangeRate;
    }

    public BigDecimal getInitialAmount() {
        return initialAmount;

    }

    public  BigDecimal CalculateExchangeRate( ) {

        BigDecimal multiply = getExchangeRate().multiply(getInitialAmount());
        return multiply;


    }
}
