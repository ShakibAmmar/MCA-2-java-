public class SevereExceptionHandling {

    public static void main(String[] args) {
        try {
         
            String str = null;
            int length = getLengthOfString(str); 
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            
            System.err.println("Error: Attempted to access a method on a null object.");
            e.printStackTrace(); 
        }
    }

    
    public static int getLengthOfString(String str) {
        return str.length(); 
    }
}
//6
