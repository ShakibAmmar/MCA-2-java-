import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        System.out.print("Enter the fourth number: ");
        double num4 = scanner.nextDouble();
    
        double sum = num1 + num2 + num3 + num4;
        
        double product = num1 * num2 * num3 * num4;
        
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The product of the numbers is: " + product);
        
        scanner.close();
    }
}