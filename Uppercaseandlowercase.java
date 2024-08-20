import java.util.*;
public class Uppercaseandlowercase{
    public static void main(String args[]){
        String str = "ABcD";
        int upperCount = 0;
        for(int i =0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                upperCount++;
            } else{
                upperCount--;
            }
        }
        if(upperCount>0){
            str = str.toUpperCase();
        } else{
            str = str.toLowerCase();
        }
        System.out.println(str);
    }
}