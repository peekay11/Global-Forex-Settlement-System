package com.pasekabank.settlement;

public class Menu {

    public static void welcome() {
        System.out.println("===============================================");
        System.out.println("||       PASEKABANK SETTLEMENT SERVICE       ||");
        System.out.println("||          'The Pillar of Precision'         ||");
        System.out.println("===============================================");
    }

    public static void load() {
        System.out.println("\n[SYSTEM]: Initializing Forex Engine...");
        System.out.println("[SYSTEM]: Loading Currency Pairs...");
        System.out.println("[SYSTEM]: Security Protocols Active.\n");
    }

    public static void options() {
        System.out.println("\n========= SETTLEMENT OPERATIONS =========");
        System.out.println("1.  PERFORM NEW CONVERSION (FROM/TO)");
        System.out.println("2.  VIEW SUPPORTED CURRENCY PAIRS");
        System.out.println("3.  CALCULATE CONVERSION SPREAD (FEES)");
        System.out.println("4.  VIEW TRANSACTION AUDIT LOG");
        System.out.println("0.  EXIT SYSTEM");
        System.out.println("=========================================");
        System.out.print("Action Selection > ");
    }


    public static void goodbye() {
        System.out.println("\n-----------------------------------------------");
        System.out.println("   Thank you for using PasekaBank. Goodbye!    ");
        System.out.println("-----------------------------------------------\n");
    }
}