import java.util.*;
public class reverseno{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       // Declare lDigit as an int
       int lDigit;
       while(n>0){
           lDigit = n%10;
           // Use the same case for lDigit
           System.out.print(lDigit + "");
           n = n /10;
       }
   }
}
