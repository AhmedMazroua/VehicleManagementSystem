abstract class Vehicle implements Drivable {
    protected String model;
    public Vehicle(String model){
        this.model = model;
    }
    public abstract void honk();
    }