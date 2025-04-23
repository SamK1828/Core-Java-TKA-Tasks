package oops.abstraction.abstract_classes.applicane_power_use;

public class Heater extends Appliance {
    @Override
    public void powerConsumption() {
        System.out.println("Heater consumes 1500W of power.");
    }
}
