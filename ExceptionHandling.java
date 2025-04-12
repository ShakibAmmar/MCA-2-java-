import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling{
    public static void main(String[] args) {
        String filename = "example.txt";   
        BufferedReader br = null;
        String line = null;
        
        try {
            br = new BufferedReader(new FileReader(filename));
            line = br.readLine(); 
            String[] words = line.split(" "); 
            System.out.println("Trying to access index 10: " + words[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an invalid index in the array.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
//2