class FloydTri{
    public static void main(String args[]){
        int a=5;
        int count =1 ;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;

            }
            System.out.println();
        }
        
    }
}