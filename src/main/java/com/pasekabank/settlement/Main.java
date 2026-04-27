package com.pasekabank.settlement;

import com.pasekabank.settlement.util.ForensicLogger;
import java.math.BigDecimal;

public class Main {




    public static void main(String[] args) {

        BigDecimal amount = new BigDecimal("100.00");
        BigDecimal conversionRate = new BigDecimal("1.15");

        ForensicLogger log = new ForensicLogger(amount, conversionRate);


        System.out.println(log.toString());

    }
}