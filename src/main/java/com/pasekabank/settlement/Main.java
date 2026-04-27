package com.pasekabank.settlement;
import com.pasekabank.settlement.service.ExchangeService;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create it once here

        Menu.welcome();


        System.out.print("Enter 1 to start settlement or 0 to exit: ");
        int choice = scanner.nextInt(); // Use it here

        if (choice == 1) {

          Menu.options();



        } else {
            Menu.goodbye();
        }

        scanner.close(); // Close it at the very end of the program
    }
}