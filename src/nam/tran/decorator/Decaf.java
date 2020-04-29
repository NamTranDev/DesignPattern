package nam.tran.decorator;

public class Decaf extends Beverage {

    public Decaf() {}

    @Override
    public String getDescription() {
        return "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
