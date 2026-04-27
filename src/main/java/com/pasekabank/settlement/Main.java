package com.pasekabank.settlement;

import com.pasekabank.settlement.service.ExchangeService;
import com.pasekabank.settlement.util.ForensicLogger;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu.welcome();

        System.out.print("Enter 1 to start settlement or 0 to exit: ");

        // non int value
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please restart and enter a number.");
            return;
        }

        int choice = scanner.nextInt();

        if (choice == 1) {
            // All currency logic must live INSIDE this brace
            Menu.options();
            int choice2 = scanner.nextInt();

            if (choice2 == 1) {
                System.out.print("Enter currency code, From: ");
                String from = scanner.next();

                System.out.print("Enter currency code, To: ");
                String to = scanner.next();

                System.out.print("Enter " + from.toUpperCase() + " amount: ");
                String amount = scanner.next();

                String currencyPair = from + "/" + to;
                BigDecimal amount1 = new BigDecimal(amount);

                //  logic
                ExchangeService exchange = new ExchangeService(currencyPair, amount1);
                ForensicLogger log = new ForensicLogger(from , to , exchange.getExchangeRate(),amount1);


                System.out.println("\n--- SETTLEMENT RESULTS ---");
                System.out.println("Exchange Rate: " + exchange.getExchangeRate());
                System.out.println("Converted Amount: " + exchange.calculateExchangeRate());
                System.out.println("--------------------------\n");

                System.out.println("generated log : ");
                System.out.println( log.generateLOg());

            }

        } else if (choice == 0) {
            Menu.goodbye();
        } else {

            System.out.println("Invalid selection. Please restart the system.");
        }

        scanner.close();
    }
}