public class MathExample {
    public static void main(String[] args) {

        int num1 = -25;
        double num2 = -12.7;
        System.out.println("Absolute value of " + num1 + ": " + Math.abs(num1));
        System.out.println("Absolute value of " + num2 + ": " + Math.abs(num2));

        double base = 2;
        double exponent = 3;
        System.out.println(base + " raised to the power of " + exponent + ": " + Math.pow(base, exponent));

        double number = 16;
        System.out.println("Square root of " + number + ": " + Math.sqrt(number));

        double roundNumber = 12.56;
        System.out.println("Round of " + roundNumber + ": " + Math.round(roundNumber));

        double numCeil = 12.3456;
        System.out.println("Ceil value of " + numCeil + ": " + Math.ceil(numCeil));

        double numFloor = 12.789;
        System.out.println("Floor value of " + numFloor + ": " + Math.floor(numFloor));

        int numA = 15;
        int numB = 10;
        System.out.println("Maximum of " + numA + " and " + numB + ": " + Math.max(numA, numB));

        System.out.println("Minimum of " + numA + " and " + numB + ": " + Math.min(numA, numB));

    }
}
