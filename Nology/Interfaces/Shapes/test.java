import java.util.HashMap;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 10, 5, 5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        triangle.setBase(10);
        triangle.setHeight(20);
        triangle.setSide1(10);
        triangle.setSide2(10);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());


        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        circle.setRadius(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
        Cone cone = new Cone(5, 10);
        System.out.println(cone.getArea());
        System.out.println(cone.getPerimeter());
        System.out.println(cone.getVolume());
        System.out.println(cone.getSurfaceArea());
        cone.setRadius(10);
        cone.setHeight(20);
        System.out.println(cone.getArea());
        System.out.println(cone.getPerimeter());
        System.out.println(cone.getVolume());
        System.out.println(cone.getSurfaceArea());

        Sphere sphere = new Sphere(5);
        System.out.println(sphere.getArea());
        System.out.println(sphere.getVolume());
        sphere.setRadius(10);
        System.out.println(sphere.getArea());
        System.out.println(sphere.getVolume());
    }
}
