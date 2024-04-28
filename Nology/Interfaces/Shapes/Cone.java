public class Cone implements Perimeter, Area, Volume, SurfaceArea{

    // To get Area, Volume & SurfaceArea, you need radius and height. 
    private double radius;
    private double height;
    
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    //Area of a cone = πr(r + √(r^2 + h^2))
    public double getArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    
    //Perimeter of a cone = πr
    public double getPerimeter() {
        return Math.PI * radius;
    }
    
    //Volume of a cone = πr^2h/3
    public double getVolume() {
        return Math.PI * radius * radius * height / 3;
    }
    
    //Surface area of a cone = πr(r + √(r^2 + h^2))
    public double getSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

}
