public class Car extends Vehicle{
    public Car(String model) {
        super(model);
    }

    // Implementing the abstract method honk() from the Vehicle class
    @Override
    public void honk() {
        System.out.println("Car " + model + " is honking");
    }

    // Implementing the drive() method from the Drivable interface
    @Override
    public void start() {
        System.out.println("Car " + model + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " is stopping.");

    }
}
