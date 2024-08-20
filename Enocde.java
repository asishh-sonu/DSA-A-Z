import java.util.*;
public class Enocde{
    public static int encode(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int digit = n % 10;
            sb.insert(0,digit*digit);
            n /=10;
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        int input1 = 34;
        System.out.println(encode(input1));
    }
}