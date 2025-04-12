import java.io.*;

class ExceptionCounter{
    public static int countExceptions(String filePath){
        try{
            FileInputStream fp = new FileInputStream(filePath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fp));
            String line;
            int c = 0;
            while((line = bufferedReader.readLine()) != null){
                if(line.contains("Exception") || line.contains("catch") ){
                    c++;
                   
                }   
            }
            bufferedReader.close();
            return c;
        }catch(IOException e){
            System.out.println("Exception : " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        int count = countExceptions("D:\\SHAKIB LAB\\java lab\\Week 8 new\\week 8\\DataProcessor.java");
        System.out.println("Total number of exceptions = " + count);
    }
}