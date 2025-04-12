import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();
        
       
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
        } else {
            
           for (int i =0 ; i <4; i ++){

            System.out.println(number%10);
            number /= 10;
           }
        }
        
        scanner.close();
    }
}