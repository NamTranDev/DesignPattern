package nam.tran.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {}

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
