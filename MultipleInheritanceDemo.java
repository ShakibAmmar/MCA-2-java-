import java.util.Scanner;

interface Vehicle {
    void start();
    void stop();
}

interface Engine {
    void accelerate();
    void brake();
}

class Car implements Vehicle, Engine {
    
    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void brake() {
        System.out.println("Car is braking.");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myCar = new Car();
        
        while (true) {
            System.out.println("Enter a command (start, stop, accelerate, brake, exit): ");
            String command = scanner.nextLine().toLowerCase();
            
            switch (command) {
                case "start":
                    myCar.start();
                    break;
                case "stop":
                    myCar.stop();
                    break;
                case "accelerate":
                    myCar.accelerate(); 
                    break;
                case "brake":
                    myCar.brake();
                    break;
                case "exit":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
