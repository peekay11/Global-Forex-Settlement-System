package com.pasekabank.settlement;

import com.pasekabank.settlement.util.ForensicLogger;
import java.math.BigDecimal;

public class Main {




    public static void main(String[] args) {

        String sourceCurne = new String("USD");
        String targetCur = new String("Zar");
        BigDecimal rate = new BigDecimal("16.49");
        BigDecimal amount  = new BigDecimal("1.00");



        ForensicLogger log = new ForensicLogger("USD",;

//view it in string format
        System.out.println(log.toString());

    }
}