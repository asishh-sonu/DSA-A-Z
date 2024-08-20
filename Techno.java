import java.util.*;
public class Techno{
    public static void main(String args[]){
        String input = "10110111011110";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == '1'){
            count++;
            } else {
            if(count>0){
                sb.append((char) +(64+ count));
                count = 0;
            }
        }
    }
        if(count>0){
            sb.append((char) + (64 + count));
        }
        System.out.println(sb.toString());
    }
    
   
}