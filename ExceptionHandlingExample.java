import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandlingExample {

    private static final Logger logger = Logger.getLogger(ExceptionHandlingExample.class.getName());

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "An arithmetic exception occurred: " + e.getMessage(), e);
            System.out.println("Oops! Something went wrong while performing the calculation. Please try again later.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
//3