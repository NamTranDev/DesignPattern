package nam.tran.decorator;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public String getDescription() {
        return "Unknown beverage";
    }
}
