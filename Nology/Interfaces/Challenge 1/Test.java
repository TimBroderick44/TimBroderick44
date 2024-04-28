public class Test {
public static void main(String[] args) {
        Bike bike = new Bike(30);
        System.out.println("Bike speed: " + bike.getSpeed() + " m/h");

        bike.decreaseSpeed(5);
        System.out.println("Slow down!!: " + bike.getSpeed() + " m/h");

        Car car = new Car(20);
        System.out.println("Car speed: " + car.getSpeed() + " m/h");

        car.decreaseSpeed(10);
        System.out.println("Slow down!!: " + car.getSpeed() + " m/h");

        car.setSpeed(40);
        System.out.println(car.getSpeed());

        bike.setSpeed(50);
        System.out.println(bike.getSpeed());
    }
}
