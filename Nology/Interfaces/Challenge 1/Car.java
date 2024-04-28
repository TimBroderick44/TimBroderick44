public class Car implements Vehicle {
    // Speed in m/s
    private double speed;

    public Car(double speed) {
        this.speed = speed;
    }

    // 1 m/s = 2.23694 miles/h
    public double getSpeed() {
        return Double.parseDouble(String.format("%.2f", speed * 2.23694));
    }

    // miles/h to m/s = divide by 2.23694 and round to 2dp
    // try a different way of rounding double -> string -> back to double
    public void decreaseSpeed(double s) {
        this.speed = Double.parseDouble(String.format("%.2f", speed - (s / 2.23694)));
    }

    // Speed is assumed to be entered in m/s
    public void setSpeed(double speed) {
        this.speed = speed;
    }

}