import java.util.*;
class StringLearing{
    public static void main(String args[]){
        char arr[] ={'a','b','c'};
        String str = "abcd";
        String str2 = new String("xyx");
        
        System.out.println(str2);
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String name;
        name = sc.next();
        System.out.print("The string is :");
        System.out.println(name);
    }
}