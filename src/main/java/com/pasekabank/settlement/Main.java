package com.pasekabank.settlement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create it once here

        Menu.welcome();
        Menu.load();

        System.out.print("Enter 1 to start settlement or 0 to exit: ");
        int choice = scanner.nextInt(); // Use it here

        if (choice == 1) {
            // Logic to start conversion


        } else {
            Menu.goodbye();
        }

        scanner.close(); // Close it at the very end of the program
    }
}