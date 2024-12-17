package state;

import model.IceCream;
import model.VendingMachine;

public class ReadyToTakeState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public ReadyToTakeState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void startSelection() {
        System.out.println("Cannot start selection. Please take your ice cream first.");
    }

    @Override
    public void chooseType() {
        System.out.println("Cannot choose type. Please take your ice cream first.");
    }

    @Override
    public void generateIceCream() {
        System.out.println("Cannot generate ice cream. Please take your ice cream first.");
    }

    @Override
    public void takeIceCream() {
        IceCream iceCream = vendingMachine.getGeneratedIceCream();
        if (iceCream != null) {
            System.out.println(iceCream);
            vendingMachine.setGeneratedIceCream(null);
            vendingMachine.setState(vendingMachine.getIdleState());
            System.out.println("Vending machine is now idle.");
        } else {
            System.out.println("No ice cream to take.");
        }
    }

    @Override
    public String toString() {
        return "Ice Cream Ready To Take State";
    }
}
