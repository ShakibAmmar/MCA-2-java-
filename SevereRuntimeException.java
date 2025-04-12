import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SevereRuntimeException {

    private static final Logger logger = Logger.getLogger(SevereRuntimeException.class.getName());

    public static void main(String[] args) {
        try {  
            String filePath = "non_existent_file.txt"; 
            readLargeFile(filePath);
        } catch (FileNotFoundException e) {        
            logger.log(Level.SEVERE, "File not found: " + e.getMessage(), e);
            System.out.println("Error: The file could not be found. Please check the file path.");
        } catch (OutOfMemoryError e) {         
            logger.log(Level.SEVERE, "Out of memory while reading the file: " + e.getMessage(), e);
            System.out.println("Error: The file is too large to load into memory.");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An error occurred while reading the file: " + e.getMessage(), e);
            System.out.println("Error: There was an issue reading the file.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected error occurred: " + e.getMessage(), e);
            System.out.println("An unexpected error occurred. Please try again later.");
        }
    }

    public static void readLargeFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("The file at " + filePath + " does not exist.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String data = new String(new char[1000000]);
                if (data.equals("")) {
                    break;
                }
            }
        } catch (OutOfMemoryError e) {
            throw e; 
        }
    }
}
//4
