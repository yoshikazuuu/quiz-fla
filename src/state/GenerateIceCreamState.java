package state;

import model.IceCream;
import model.VendingMachine;
import template.*;

import java.util.Scanner;

/**
 * Represents the Generate Ice Cream State of the Vending Machine.
 */
public class GenerateIceCreamState implements VendingMachineState {
    private VendingMachine vendingMachine;
    private Scanner scanner;

    public GenerateIceCreamState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void startSelection() {
        System.out.println("Cannot start selection. Currently generating ice cream.");
    }

    @Override
    public void chooseType() {
        System.out.println("Already chosen type. Cannot change.");
    }

    @Override
    public void generateIceCream() {
        String type = vendingMachine.getSelectedType();
        IceCreamPreparation preparation;

        if ("Bucket".equalsIgnoreCase(type)) {
            preparation = new BucketPreparation();
        } else if ("Cone".equalsIgnoreCase(type)) {
            preparation = new ConePreparation();
        } else {
            System.out.println("Invalid ice cream type selected.");
            return;
        }

        IceCream iceCream = preparation.prepareIceCream();
        vendingMachine.setGeneratedIceCream(iceCream);
        System.out.println("Ice cream is ready!");
        vendingMachine.setState(vendingMachine.getReadyToTakeState());
    }

    @Override
    public void takeIceCream() {
        System.out.println("Cannot take ice cream. It is still being generated.");
    }

    @Override
    public String toString() {
        return "Generate Ice Cream State";
    }
}
