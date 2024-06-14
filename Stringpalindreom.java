import java.util.*;
public class Stringpalindreom{
    public static boolean isPalindrome(String str){
        for(int i =0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not a palindrome 
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "noon";
        System.out.print(isPalindrome(str));
    }
}