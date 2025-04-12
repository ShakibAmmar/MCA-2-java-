class Floydtriangle{
    public static void main(String args[]){
        int a = 5;
        int one = 1;
        int zero = 0;
        for(int i=1; i<=a ; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(one + " ");
                }
                else{
                    System.out.print(zero + " ");
                }
               
            }
            System.out.println();
        }
    }
}