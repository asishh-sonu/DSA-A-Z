import java.util.ArrayDeque;

public class LearnArrayDeque{
    public static void  main(String args[]){
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(20);
        adq.offerFirst(10);
        adq.offerLast(30);
        System.out.println(adq); //adding
    }
}