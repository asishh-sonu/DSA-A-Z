import java.util.*;
public class SumofNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits : ");
        int n = sc.nextInt();
        int SumofDigits = 0;
        int original_n = n;

        while(n>0){
            SumofDigits += n % 10;
            n = n/10;
            
        }
        System.out.println("Number of digits in " + original_n + " = " + SumofDigits);
    }
}