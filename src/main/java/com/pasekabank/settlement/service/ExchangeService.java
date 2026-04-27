package com.pasekabank.settlement.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeService {
    private BigDecimal exchangeRate;
    private BigDecimal initialAmount;
    private String currency;


    public ExchangeService(String currencyPair, BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
        this.currency = currencyPair;


        switch (currencyPair.toUpperCase()) {
            case "USD/ZAR":
                this.exchangeRate = new BigDecimal("18.53"); // Adjusted to realistic 2026 rates
                break;
            case "ZAR/USD":
                this.exchangeRate = new BigDecimal("0.06");
                break;
            default:
                throw new IllegalArgumentException("Unsupported Currency Pair: " + currencyPair);
        }
    }



    public BigDecimal validateBigDecimal(BigDecimal amount) {

        if (amount == null) {
            throw new IllegalArgumentException("Amount cannot be null.");
        }


        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount must be a positive value greater than zero.");
        }

        return amount;
    }
    public BigDecimal getExchangeRate() {

        return validateBigDecimal(exchangeRate);
    }

    public BigDecimal getInitialAmount() {
        return validateBigDecimal(initialAmount);
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal calculateExchangeRate() {

        if (exchangeRate == null || initialAmount == null) {
            return BigDecimal.ZERO;
        }

        BigDecimal result = getInitialAmount().multiply(getExchangeRate());
        return result.setScale(2, RoundingMode.HALF_UP);
    }
}