import java.util.*;
public class ReverseStr{
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String args[]){
        String input = "hello World";
        String result = reverseString(input);
        System.out.println(result);
    }
}