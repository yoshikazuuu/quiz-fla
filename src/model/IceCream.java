package model;

public class IceCream {
    private String type;     // "Bucket" or "Cone"
    private String flavor;   // "Strawberry", "Vanilla", or "Chocolate"
    private String name;     // e.g., "Strawberry Bucket"

    public IceCream(String type, String flavor) {
        this.type = type;
        this.flavor = flavor;
        this.name = flavor + " " + type;
    }

    public String getType() {
        return type;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ice Cream Details:\n" +
                "Name: " + name + "\n" +
                "Type: " + type + "\n" +
                "Flavor: " + flavor;
    }

}
