import java.util.Scanner;

class Calculator{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();

        System.out.println("Sum of Two Number is "+ (a+b));
        System.out.println("Difference of first Number and Secind Number is " + (a-b));
	System.out.println("Product of Number is " + (a*b));
	System.out.println("Quotient of Number is " + (a/b));
	if(a>b==true){
	System.out.println("maximum number is " + a );
       
}else{
	System.out.println("Minimum number is " + a);
}

}
}