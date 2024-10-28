public class Motorcycle extends Vehicle{
    public Motorcycle(String model) {
        super(model);
    }

    // Implementing the abstract method honk() from the Vehicle class
    @Override
    public void honk() {
        System.out.println("Motorcycle " + model + " is honking");
    }

    // Implementing the drive() method from the Drivable interface
    @Override
    public void start() {
        System.out.println("Motorcycle " + model + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle " + model + " is stopping.");

    }
}