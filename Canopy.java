import java.util.*;
import java.util.Scanner;
public class Canopy{
    public static int calculateArea(int D){
        double pi = Math.PI;
        double area = pi*D*D;
        return (int)Math.round(area);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance D: ");
        int D = sc.nextInt();
        int area = calculateArea(D);
        
        // Output: Shadow area of the canopy
        System.out.println("The shadow area of the canopy is: " + area);
    }
}
    