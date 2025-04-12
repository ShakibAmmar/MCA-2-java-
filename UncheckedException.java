public class UncheckedException {
    public static void main(String[] args) {
        
        String str = null;
        try {
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.err.println("Error: NullPointerException - Attempted to call method on a null object.");
        }

        
        int[] arr = {1, 2, 3};
        try {
            System.out.println("Accessing invalid index: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: ArrayIndexOutOfBoundsException - Index out of bounds.");
        }

       
        String numberStr = "abc";
        try {
            int number = Integer.parseInt(numberStr); 
        } catch (NumberFormatException e) {
            System.err.println("Error: NumberFormatException - Invalid number format.");
        }

        int a = 10;
        int b = 0;
        try {
            int result = a / b; 
        } catch (ArithmeticException e) {
            System.err.println("Error: ArithmeticException - Division by zero.");
        }

      
        int age = -5;
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: IllegalArgumentException - " + e.getMessage());
        }
    }
}
//1