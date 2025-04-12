public class MyNumber {
    public static void main(String[] args) {
        
        double num = 56.764;
         
        double numRound = Math.round(num);
        
        double numCeil = Math.ceil(num); 
    
        double numFloor = Math.floor(num);
         
        System.out.println("Original number: " + num);
        System.out.println("Rounded number: " + numRound);
        System.out.println("Ceil value: " + numCeil);
        System.out.println("Floor value: " + numFloor);
    }
}
