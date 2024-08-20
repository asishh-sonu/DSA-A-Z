import java.util.*;
import java.util.Scanner;
public class MinimumMark{
    public static int findMinimumMark(int mark1,int mark2,int mark3){
        return Math.min(mark1,Math.min(mark2,mark3));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for three Olympiads:");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        int minMark = findMinimumMark(mark1,mark2,mark3);
        System.out.println("Smallest number is " + minMark);
    }
}