public class SwapPratice{
    public static void SwapFunction(int a, int b){
        System.out.println("Original value: a = " + a + " b:" + b);

        int c= a;
        a = b;
        b = c;
        System.out.println("Original value: a = " + a + " b:" + b);

    }

    public static void main(String args[]){
        int x = 10;
        int y = 20;

        SwapFunction(x,y);
    }
}