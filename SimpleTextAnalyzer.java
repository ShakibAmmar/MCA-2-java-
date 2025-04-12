import java.util.Scanner;
import java.util.StringTokenizer;

public class SimpleTextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder textBuilder = new StringBuilder();

        System.out.println("Enter your text (type 'exit' to finish):");
        String line;
        while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
            textBuilder.append(line).append("\n");
        }

        String text = textBuilder.toString().trim();
        System.out.println(text);
        

        StringTokenizer wordTokenizer = new StringTokenizer(text);
        int wordCount = wordTokenizer.countTokens();
        
        
        StringTokenizer sentenceTokenizer = new StringTokenizer(text, ".!?");
        int sentenceCount = sentenceTokenizer.countTokens();
        
        
        StringTokenizer lineTokenizer = new StringTokenizer(text, "\n");
        int lineCount = lineTokenizer.countTokens();
        
    
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of times 'e' occurs: " + countOccurrences(text, 'e'));
        System.out.println("Number of times 'z' occurs: " + countOccurrences(text, 'z'));
        
        scanner.close();
    }

    private static int countOccurrences(String text, char c) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
