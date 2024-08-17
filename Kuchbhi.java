public class Kuchbhi{
    public static int sumOfBinaryDigits(int n){
       int  sum = 0;
       while( n > 0){
        sum += n & 1;
        n >>=1;
       } 
       return sum;
    }

    public static void main(String args[]){
        int n = 15;
        int result = sumOfBinaryDigits(n);
        System.out.print(result);
    }
}