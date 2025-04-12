import java.util.Scanner;

class Sum{
    public static void main(String args[]){
        System.out.println("Enter the Number of term: ");
        Scanner num = new Scanner(System.in);
        int totalN = num.nextInt();
        int totalSum=0;
        int add =0;
        for(int i=1; i<=totalN; i++){
             add= add + 2;
             totalSum=totalSum + add;
        }
        System.out.println(totalSum);

    }
}