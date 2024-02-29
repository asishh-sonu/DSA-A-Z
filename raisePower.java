import java.util.*;
public class raisePower{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();
        System.out.println("Enter b = ");
        int b = sc.nextInt();
        int ans = 1;
        for(int i = 0; i<=b; i++){
            ans = ans * a;
        }
        System.out.println(ans);

    }
}