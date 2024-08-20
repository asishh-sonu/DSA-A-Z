public class CountLetters{
    public static void main(String args[]){
        String sb = "HelloWorld";
        int count =0;
        char target = 'l';
        for(int i =0;i<sb.length();i++){
            if(sb.charAt(i) == target){
                count++;
            }
        }
        System.out.println(count);
    }
}