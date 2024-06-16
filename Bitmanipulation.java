import java.util.*;
public class Bitmanipulation{
    public static void OddOrEven(int n){
        int bitMask=1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        } else {
            System.out.println("Odd number");
        }
    }
    public static void main(String args[]){
        // System.out.println((5&6));
        // System.out.println((5|6));
        // System.out.println((5 ^ 6));
        // System.out.println((~5));
        // System.out.println((6>>1));
        // System.out.println((5<<2));

        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14);
        
    }
}