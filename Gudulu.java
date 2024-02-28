import java.util.*;
public class Gudulu{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number - ");
        int day = sc.nextInt();

        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2: 
            System.out.println("Tue");
            break;
            case 3:
            System.out.println("Wed");
            break;
            case 4:
            System.out.println("Thu");
            break;
            case 5:
            System.out.println("Fri");
            break;
            case 6:
            System.out.println("Sat");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            case 8:
            System.out.println("Invilid day");
            break;
        }
    }
}