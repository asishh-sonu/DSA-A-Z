public class Sonuuu{
    public static void PrimesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
            System.out.print(i + "");
        }
    } 
    System.out.println();
}
    public static void main(String args[]){
        PrimesInRange(20);
    }
}