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

    public static void goodbye() {
        System.out.println("\n-----------------------------------------------");
        System.out.println("   Thank you for using PasekaBank. Goodbye!    ");
        System.out.println("-----------------------------------------------\n");
    }
}