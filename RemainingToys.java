import java.util.*;
import java.util.Scanner;
public class RemainingToys{
    public static int  calculateRemainingToys(int totaltoys, int donetedtoys){
        return totaltoys - donetedtoys;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int totaltoys = sc.nextInt();
        int donetedtoys = sc.nextInt();

        int remainingToys =  calculateRemainingToys(totaltoys,donetedtoys);
        System.out.println("Remaining toys :"+ remainingToys);
    }
}