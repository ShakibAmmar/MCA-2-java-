import java.util.Scanner;

class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    
    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    
    public boolean isPointInside(double x, double y) {
        double distanceSquared = (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY);
        return distanceSquared < (radius * radius);
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the radius of the circle (negative value to quit): ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                break; 
            }

            System.out.print("Enter the x-coordinate of the center: ");
            double centerX = scanner.nextDouble();
            System.out.print("Enter the y-coordinate of the center: ");
            double centerY = scanner.nextDouble();

            Circle circle = new Circle(radius, centerX, centerY);

            System.out.printf("Area of the circle: %.2f%n", circle.computeArea());
            System.out.printf("Perimeter of the circle: %.2f%n", circle.computePerimeter());

            System.out.print("Enter the x-coordinate of the point to check: ");
            double pointX = scanner.nextDouble();
            System.out.print("Enter the y-coordinate of the point to check: ");
            double pointY = scanner.nextDouble();

            if (circle.isPointInside(pointX, pointY)) {
                System.out.println("The point is inside the circle.");
            } else {
                System.out.println("The point is outside the circle.");
            }
        }

        System.out.println("Program terminated.");
        scanner.close();
    }
}