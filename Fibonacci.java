import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");

        
        int count = 0;

        
        do {
            if (count == 0) {
                System.out.print(first + " ");
            } else if (count == 1) {
                System.out.print(second + " ");
            } else {
                int next = first + second; 
                System.out.print(next + " ");
                first = second;  
                second = next;   
            }
            count++; 
        } while (count < n);
scanner.close();
    }
}
