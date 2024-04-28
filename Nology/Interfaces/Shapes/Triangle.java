public class Triangle implements Area, Perimeter{

    // To get the Area and Perimeter, we need the length of the two sides, the base and the height of the triangle.

    private double base;
    private double height;
    private double side1;
    private double side2;
    
    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    
    public double getArea() {
        return base * height / 2;
    }
    
    public double getPerimeter() {
        return side1 + side2 + base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    public double getBase() {
        return base;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getSide1() {
        return side1;
    }
    
    public double getSide2() {
        return side2;
    }
    
}
