import java.util.*;
class StringRev{
    public static void printLeters(String str){
        for(int i =0;i<str.length();i++){
        System.out.print(str.charAt(i) + " ");
        }
       
    }
    public static void main(String args[]){
        String fullname = "Asish Kumar Barik";
        System.out.println(fullname.length());

        String firstname = "asish";
        String lastname = "kumar Barik";
        String fname = firstname + " " + lastname;
        

        printLeters(fname);
    }
}