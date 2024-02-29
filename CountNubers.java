import java.util.*;
public class CountNubers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits : ");
        int n = sc.nextInt();
        int numofDigits = 0;
        int original_n = n;

        while(n>0){
            n = n/10;
            numofDigits++;
        }
        System.out.println("Number of digits in " + original_n + " = " + numofDigits);
    }
}