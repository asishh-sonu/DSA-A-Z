import java.util.*;
    public class ArrayCC{
        public static void main(String args[]){
            int marks[] = new int [100];

            Scanner sc = new Scanner(System.in);

            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();

            System.out.println("Maths : " + marks[0]);
            System.out.println("Odia : " + marks[1]);
            System.out.println("English : " + marks[2]);

            //updated marks
            marks[2] = marks[2] + 2;
            System.out.println("English : " + marks[2]);
        }
    }