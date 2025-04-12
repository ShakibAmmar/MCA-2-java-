import java.util.Scanner;

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales amount: ");
        double sale = scanner.nextDouble();

    
        if (sale < 0) {
            System.out.println("Invalid Input");
        } else {
            
            Commission commission = new Commission(sale);
            
            double commissionAmount = commission.commission();
            System.out.printf("The commission for sales of %.2f is %.2f%n", sale, commissionAmount);
        }

        scanner.close();
    }
}
class Commission {
    private double sale;

    
    public Commission(double sale) {
        this.sale = sale;
    }

    
    public double commission() {
        if (sale < 500) {
            return sale * 0.02;
        } else if (sale <= 5000) {
            return sale * 0.05; 
        } else {
            return sale * 0.08; 
        }
    }
}