public class ReverseString{
    public static void main(String args[]){
        String s = "My name is Asish";

        StringBuilder sr = new StringBuilder(s);
        sr.reverse();
        System.out.println("Reverse string is: " + sr); 
    }
}