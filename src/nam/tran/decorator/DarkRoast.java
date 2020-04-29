package nam.tran.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {}

    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
