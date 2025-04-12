import java.util.Scanner;
interface Shape {
    void draw();  
    double area();
}

class Circle implements Shape {
    double radius;
    

    Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle.");
    }

    
    public double area() {
        return Math.PI * radius * radius;
    }
}


class Rectangle implements Shape {
    double length, width;
    
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }

    
    public double area() {
        return length * width;
    }
}


public class ShapeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of circle ");
        Double radius = sc.nextDouble();
        System.out.println("enter length of rectangle ");
        Double length = sc.nextDouble();
        System.out.println("enter width of rectangle ");
        Double width = sc.nextDouble();
        Shape circle = new Circle(radius);
        circle.draw();
        System.out.println("Area of Circle: " + circle.area());  
        
        
        Shape rectangle = new Rectangle(length,width);
        rectangle.draw();  
        System.out.println("Area of Rectangle: " + rectangle.area());  
    }
}
