public class Rhombus implements Perimeter, Area{

    // To get Perimeter and Area, we need a side and 2 diagonals 
    
    private double side;
    private double diagonal1;
    private double diagonal2;
    
    public Rhombus(double side, double diagonal1, double diagonal2) {
        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    
    public double getArea() {
        return diagonal1 * diagonal2 / 2;
    }
    
    public double getPerimeter() {
        return 4 * side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }
    
    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
    
    public double getSide() {
        return side;
    }
    
    public double getDiagonal1() {
        return diagonal1;
    }
    
    public double getDiagonal2() {
        return diagonal2;
    }
}
