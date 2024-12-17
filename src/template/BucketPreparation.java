package template;

import model.IceCream;

import java.util.Scanner;

/**
 * Concrete implementation of IceCreamPreparation for Bucket.
 */
public class BucketPreparation extends IceCreamPreparation {
    private String flavor;
    private Scanner scanner;

    public BucketPreparation() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    protected void prepareContainer() {
        System.out.println("Preparing a bucket for your ice cream...");
    }

    @Override
    protected String chooseFlavor() {
        System.out.println("Choose Flavor for Bucket:");
        System.out.println("1. Strawberry");
        System.out.println("2. Vanilla");
        System.out.print("Enter choice (1 or 2): ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                flavor = "Strawberry";
                break;
            case "2":
                flavor = "Vanilla";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Vanilla.");
                flavor = "Vanilla";
        }
        return flavor;
    }

    @Override
    protected IceCream generateIceCream(String flavor) {
        System.out.println("Generating " + flavor + " Bucket...");
        return new IceCream("Bucket", flavor);
    }
}
