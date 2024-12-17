package state;

import model.VendingMachine;

import java.util.Scanner;

/**
 * Represents the Picking Ice Cream State of the Vending Machine.
 */
public class PickingIceCreamState implements VendingMachineState {
    private VendingMachine vendingMachine;
    private Scanner scanner;

    public PickingIceCreamState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void startSelection() {
        System.out.println("Already in Picking Ice Cream State.");
    }

    @Override
    public void chooseType() {
        System.out.println("Choose Ice Cream Type:");
        System.out.println("1. Bucket");
        System.out.println("2. Cone");
        System.out.print("Enter choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                vendingMachine.setSelectedType("Bucket");
                System.out.println("Bucket selected.");
                vendingMachine.setState(vendingMachine.getGenerateState());
                break;
            case "2":
                vendingMachine.setSelectedType("Cone");
                System.out.println("Cone selected.");
                vendingMachine.setState(vendingMachine.getGenerateState());
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
    }

    @Override
    public void generateIceCream() {
        System.out.println("Cannot generate ice cream. Please choose the type first.");
    }

    @Override
    public void takeIceCream() {
        System.out.println("Cannot take ice cream. It hasn't been generated yet.");
    }

    @Override
    public String toString() {
        return "Picking Ice Cream State";
    }
}
