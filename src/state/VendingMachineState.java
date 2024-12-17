package state;

public interface VendingMachineState {
    void startSelection();
    void chooseType();
    void generateIceCream();
    void takeIceCream();
}
