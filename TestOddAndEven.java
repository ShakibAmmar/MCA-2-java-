import java.util.Scanner;

class OddAndEven {
    private int countOfOdd;
    private int countOfEven;

    public OddAndEven() {
        countOfOdd = 0;
        countOfEven = 0;
    }

    public void addNumber(int number) {
        if (number % 2 == 0) {
            countOfEven++;
        } else {
            countOfOdd++;
        }
    }

    @Override
    public String toString() {
        return "Number of Odd: " + countOfOdd + ", Number of Even: " + countOfEven;
    }
}

public class TestOddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OddAndEven oddAndEven = new OddAndEven();

        System.out.println("Enter numbers to count odd and even (enter 'Q' to quit):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                oddAndEven.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or 'Q' to quit.");
            }
        }

        System.out.println(oddAndEven);
        scanner.close();
    }
}