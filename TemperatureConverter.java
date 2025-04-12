import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.printf("%-15s%-15s%n", "Fahrenheit","Celsius");
        System.out.println("------------------------------");
        
        for (int i = 1; i<=5; i++) {
            
            int fahrenheit = scanner.nextInt();
            double celsius = (fahrenheit - 32) / 1.8;
            
            System.out.printf("%-15d%-15.3f%n",fahrenheit, celsius);
        }
        
        scanner.close();
    }
}