package com.pasekabank.settlement.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeService {
    private BigDecimal exchangeRate;
    private BigDecimal initialAmount;

    //
    public ExchangeService(BigDecimal initialAmount, BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        this.initialAmount = initialAmount;
    }

    public BigDecimal getExchangeRate() {
        if (exchangeRate == null) {
            throw new IllegalArgumentException("Exchange rate cannot be null.");
        }
        if (exchangeRate.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Exchange rate must be greater than zero.");
        }
        return exchangeRate;
    }

    public BigDecimal getInitialAmount() {
        if (initialAmount == null) {
            throw new IllegalArgumentException("Initial amount cannot be null.");
        }
        // negative money
        if (initialAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount to exchange cannot be negative.");
        }
        return initialAmount;
    }

    public BigDecimal calculateExchangeRate() {

        BigDecimal result = getExchangeRate().multiply(getInitialAmount());


        return result.setScale(2, RoundingMode.HALF_UP);
    }
}