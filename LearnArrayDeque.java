import java.util.ArrayDeque;

public class LearnArrayDeque{
    public static void  main(String args[]){
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(20);
        adq.offerFirst(10);
        adq.offerLast(30);
        adq.offer(56);
        adq.offer(85);
        System.out.println(adq); //adding

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll()" + adq); //poll
        
        System.out.println(adq.pollFirst());
        System.out.println("pollFirst()" + adq);

        System.out.println(adq.pollLast());
        System.out.println("PollLast()" +adq); //poll last
    }
}