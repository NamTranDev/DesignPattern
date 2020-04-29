package nam.tran.decorator;

public class Espresso extends Beverage {

    public Espresso() {}

    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
