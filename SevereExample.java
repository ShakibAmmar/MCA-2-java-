public class SevereExample {

    public static void main(String[] args) {
        String str = null;  
        try {
        } catch (NullPointerException e) {
            System.out.println("A severe error occurred: The object is null.");
            e.printStackTrace();  
        }

        System.out.println("Program continues after exception handling.");
    }
}
//5