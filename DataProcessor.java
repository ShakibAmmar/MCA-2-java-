import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class DataProcessor {
    public static void main(String[] args) {
        readValuesFromFile("test.txt");
    }

    public static void readValuesFromFile(String filePath) {
        try {
            FileInputStream myFile = new FileInputStream(filePath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(myFile));
            List<String> values = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) { 
                String[] tokens = line.split("\\s+");
                for(String token : tokens){
                    values.add(token);                   
                }
            }
            validateData(values);
            bufferedReader.close();
        } catch (IOException e) { 
            System.out.println("Error: Unable to read file");
        }   
    }

    public static void validateData(List<String> values) {
        List<Double> numericValues = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            String word = values.get(i);
            try {
                boolean check = word.chars().allMatch(Character::isDigit);
                if (!check) {
                    throw new InvalidDataException("Invalid Data Exception at index " + i + ": " + word);
                } else {
                    numericValues.add(Double.parseDouble(word));
                }
            } catch (InvalidDataException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
        System.out.println("Valid Numeric Values: " + numericValues);
        calculateAverage(numericValues);
    }

    public static void calculateAverage(List<Double> values){
        double avg = 0.0 , sum = 0.0;
        for(Double value : values){
            sum += value;
        }
        avg = sum / values.size();
        System.out.println(avg);
        writeResultToFile(avg, "result.txt");
    }

    public static void writeResultToFile(double avg , String filePath){
        try{
            FileWriter fw = new FileWriter(filePath);
            fw.write("Average = " + avg);
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}

class InvalidDataException extends Exception{
    public InvalidDataException(String message){
        super(message);
    }
}