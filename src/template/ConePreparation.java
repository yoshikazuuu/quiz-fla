package template;

import model.IceCream;

import java.util.Scanner;

/**
 * Concrete implementation of IceCreamPreparation for Cone.
 */
public class ConePreparation extends IceCreamPreparation {
    private String flavor;
    private Scanner scanner;

    public ConePreparation() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    protected void prepareContainer() {
        System.out.println("Preparing a cone for your ice cream...");
    }

    @Override
    protected String chooseFlavor() {
        System.out.println("Choose Flavor for Cone:");
        System.out.println("1. Strawberry");
        System.out.println("2. Chocolate");
        System.out.print("Enter choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                flavor = "Strawberry";
                break;
            case "2":
                flavor = "Chocolate";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Chocolate.");
                flavor = "Chocolate";
        }
        return flavor;
    }

    @Override
    protected IceCream generateIceCream(String flavor) {
        System.out.println("Generating " + flavor + " Cone...");
        return new IceCream("Cone", flavor);
    }
}
