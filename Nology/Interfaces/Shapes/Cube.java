public class Cube implements Perimeter, Area, Volume, SurfaceArea{
    
    // To get Perimeter, Area and SurfaceArea, require side
    private double side;
    
    public Cube(double side) {
        this.side = side;
    }
    
    public double getArea() {
        return 6 * side * side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
    
    public double getPerimeter() {
        return 12 * side;
    }
    
    public double getVolume() {
        return side * side * side;
    }
    
    public double getSurfaceArea() {
        return 6 * side * side;
    }
}
