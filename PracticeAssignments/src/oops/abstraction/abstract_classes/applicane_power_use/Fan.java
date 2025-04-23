package oops.abstraction.abstract_classes.applicane_power_use;

public class Fan extends Appliance {
    @Override
    public void powerConsumption() {
        System.out.println("Fan consumes 75W of power.");
    }
}
