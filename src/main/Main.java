package main;

import model.VendingMachine;

import java.util.Scanner;

public class Main {
    public Main() {

        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.println("=== Welcome to Angelic Icy Cream Vending Machine ===");

        while (choice != 0) {
            System.out.println("\nCurrent State: " + vendingMachine);
            displayMenu();
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    vendingMachine.startSelection();
                    break;
                case 2:
                    vendingMachine.chooseType();
                    break;
                case 3:
                    vendingMachine.generateIceCream();
                    break;
                case 4:
                    vendingMachine.takeIceCream();
                    break;
                case 0:
                    System.out.println("Exiting the vending machine. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (0-4).");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new Main();
    }

    private static void displayMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("1. Start Selection");
        System.out.println("2. Choose Ice Cream Type");
        System.out.println("3. Generate Ice Cream");
        System.out.println("4. Take Ice Cream");
        System.out.println("0. Exit");
    }

}
