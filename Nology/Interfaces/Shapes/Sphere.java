public class Sphere implements Perimeter, Area, Volume, SurfaceArea{
    private double radius;
    
    // To get the Area, Perimeter and SurfaceArea we need radius
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double getVolume() {
        return 4.0/3.0 * Math.PI * radius * radius * radius;
    }
    
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

}
