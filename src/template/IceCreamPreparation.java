package template;

import model.IceCream;

public abstract class IceCreamPreparation {

    // Template method
    public IceCream prepareIceCream() {
        prepareContainer();
        String flavor = chooseFlavor();
        return generateIceCream(flavor);
    }

    protected abstract void prepareContainer();

    protected abstract String chooseFlavor();

    protected abstract IceCream generateIceCream(String flavor);
}
