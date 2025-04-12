import java.util.Scanner;

public class PossibleComb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first digit (0-9): ");
        int firstDigit = scanner.nextInt();
        System.out.print("Enter second digit (0-9): ");
        int secondDigit = scanner.nextInt();
        System.out.print("Enter third digit (0-9): ");
        int thirdDigit = scanner.nextInt();
        
        
        if (firstDigit == secondDigit || firstDigit == thirdDigit || secondDigit == thirdDigit) {
            System.out.println("Please enter three different digits.");
        } else {
    
            System.out.println("All possible combinations:");
            int[] digits = {firstDigit, secondDigit, thirdDigit};
            
        
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (i != j && j != k && i != k) {
                            System.out.println("" + digits[i] + digits[j] + digits[k]);
                        }
                    }
                }
            }
        }
        
        scanner.close();
    }
}