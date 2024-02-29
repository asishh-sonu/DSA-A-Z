import java.util.*;
public class ReversedNumbers{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the digits : ");

        int n = sc.nextInt();

        int ans = 0;
        while(n>0){
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}