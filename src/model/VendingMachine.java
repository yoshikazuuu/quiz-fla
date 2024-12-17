package model;


import state.*;

public class VendingMachine {
    private VendingMachineState idleState;
    private VendingMachineState pickingState;
    private VendingMachineState generateState;
    private VendingMachineState readyToTakeState;

    private VendingMachineState currentState;

    private String selectedType;
    private IceCream generatedIceCream;

    public VendingMachine() {
        idleState = new IdleState(this);
        pickingState = new PickingIceCreamState(this);
        generateState = new GenerateIceCreamState(this);
        readyToTakeState = new ReadyToTakeState(this);

        currentState = idleState;
    }

    // State management
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getPickingState() {
        return pickingState;
    }

    public VendingMachineState getGenerateState() {
        return generateState;
    }

    public VendingMachineState getReadyToTakeState() {
        return readyToTakeState;
    }

    // Action methods
    public void startSelection() {
        currentState.startSelection();
    }

    public void chooseType() {
        currentState.chooseType();
    }

    public void generateIceCream() {
        currentState.generateIceCream();
    }

    public void takeIceCream() {
        currentState.takeIceCream();
    }

    // Getters and Setters
    public String getSelectedType() {
        return selectedType;
    }

    public void setSelectedType(String selectedType) {
        this.selectedType = selectedType;
    }

    public IceCream getGeneratedIceCream() {
        return generatedIceCream;
    }

    public void setGeneratedIceCream(IceCream generatedIceCream) {
        this.generatedIceCream = generatedIceCream;
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}
