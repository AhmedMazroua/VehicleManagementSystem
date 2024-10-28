//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Honda");
        honda.honk();
        honda.start();
        honda.stop();

        Motorcycle harlyD = new Motorcycle("Low Rider");
        harlyD.honk();
        harlyD.start();
        harlyD.stop();
        }
    }