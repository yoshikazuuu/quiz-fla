package state;

import model.VendingMachine;

public class IdleState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void startSelection() {
        System.out.println("Starting ice cream selection...");
        vendingMachine.setState(vendingMachine.getPickingState());
    }

    @Override
    public void chooseType() {
        System.out.println("Cannot choose type. The machine is idle. Please start selection first.");
    }

    @Override
    public void generateIceCream() {
        System.out.println("Cannot generate ice cream. Please start selection first.");
    }

    @Override
    public void takeIceCream() {
        System.out.println("No ice cream to take. Please start selection first.");
    }

    @Override
    public String toString() {
        return "Idle State";
    }
}
