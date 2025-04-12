import java.util.*;

public class NullPointerExceptionHandler {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); 

        System.out.println("\nVersion 1: Try-Catch for NullPointerException");
        version1(str);

        System.out.println("\nVersion 2: Null Check Before Accessing Object");
        version2(str);

        System.out.println("\nVersion 3: Using Optional to Avoid NullPointerException");
        version3(str);
        
        scanner.close(); 
    }

    
    public static void version1(String str) {
        try {
            int length = str.length();
            System.out.println("String length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: The string is null.");
        }
    }

  
    public static void version2(String str) {
        if (str != null) {
            int length = str.length();
            System.out.println("String length: " + length);
        } else {
            System.out.println("Null value detected, no method call.");
        }
    }

  
    public static void version3(String str) {
        if (Objects.isNull(str)) {
            System.out.println("The string is null, cannot perform operation.");
        } else {
            System.out.println("Length of the string: " + str.length());
        }

        if (Objects.nonNull(str)) {
            System.out.println("Length of the string: " + str.length());
        } else {
            System.out.println("The string is null, cannot perform operation.");
        }
    }
}
