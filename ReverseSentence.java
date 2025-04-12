import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        
        String reversedSentence = reverseWordsInSentence(input);
        
    
        System.out.println("Reversed words in the sentence: ");
        System.out.println(reversedSentence);
        
        scanner.close();
    }

    public static String reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" "); 
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" "); 
        }

        
        return result.toString().trim();
    }
}
