public class Bike implements Vehicle {
    // Speed in km/h
    private double speed;

    public Bike(double speed) {
        this.speed = speed;
    }

    // (1 km/h = 0.62 miles/h)
    public double getSpeed() {
        return Double.parseDouble(String.format("%.2f", speed * 0.62));
    }

    // miles/h to km/h = divide by 0.62 and round to 2dp
    // try a different way of rounding double -> string ->　back to double
    public void decreaseSpeed(double s) {
        speed = Double.parseDouble(String.format("%.2f", (speed - s) / 0.62));
    }

    // Whatever is entered is assumed to be in km/h
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}