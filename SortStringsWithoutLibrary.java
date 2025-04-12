import java.util.Scanner;



public class SortStringsWithoutLibrary {
    public static void main(String[] args) {
       System.out.println(" enter three string");
       Scanner sc = new Scanner ( System.in);

       String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        
        System.out.println("Original Strings: " + str1 + " " + str2 + " " + str3);
        
        if (isGreaterThan(str1, str2)) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        
        if (isGreaterThan(str2, str3)) {
            String temp = str2;
            str2 = str3;
            str3 = temp;
        }
        
        if (isGreaterThan(str1, str2)) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        
        System.out.println("Sorted Strings: " + str1 + " " + str2 + " " + str3);
    }

    public static boolean isGreaterThan(String s1, String s2) {
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return true;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                return false;
            }
            i++;
        }
        
        return s1.length() > s2.length();
    }
}
