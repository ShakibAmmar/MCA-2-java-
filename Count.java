class Count {
    public static void main(String[] args) {
        int[] number = {2, 3, 6, 5, 4, 7, 8, 9, 5, 44, 7, 7, 85};
        int countOdd = 0;  
        int countEven = 0;

        for(int i = 0; i < number.length; i++) {  
            if(number[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        
        System.out.println("Total even numbers: " + countEven);
        System.out.println("Total odd numbers: " + countOdd);
    }
}
