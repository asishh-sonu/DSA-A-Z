public class baby {

   public int countSubstrings(String s) { // Change access to public
       int count = 0;
       for (int i = 0; i < s.length(); i++) {
           count += expandPalindrome(s, i, i);
           count += expandPalindrome(s, i, i + 1);
       }
       return count;
   }

   private int expandPalindrome(String s, int left, int right) {
       int count = 0;
       while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
           count++;
           left--;
           right++;
       }
       return count;
   }

   // Remove main method here, as it's likely in a separate driver class
}
