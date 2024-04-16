import java.util.*;

public class CountVowelConsonant {
    public static void main(String args[]) {
        int vCount = 0, cCount = 0;

        String str = "My name is Asish Kumar Barik";
        str = str.toLowerCase();
        System.out.println("String in lower case: " + str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                cCount++;
            }
        }

        System.out.println("Total number of vowels are: " + vCount);
        System.out.println("Total number of consonants are: " + cCount);
    }
}
