public class Fbb{
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String args[])
{
    int a = 50;
    int b = 10;
    Swap(a,b);
}
}