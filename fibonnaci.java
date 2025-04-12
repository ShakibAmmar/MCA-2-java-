import java.util.Scanner;

public class fibonnaci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1, nextTerm;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
       
        int count = 0;
        do {
            System.out.print(a + " ");
            nextTerm = a + b;
            a = b; 
            b = nextTerm;
            count++;
        } while (count < n);
        
        scanner.close();
    }
}