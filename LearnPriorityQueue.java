import java.util.PriorityQueue;
import java.util.Queue;
public class LearnPriorityQueue{
    public static void main(String args[]){
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(12);
        pq.offer(8);
        pq.offer(60);
        pq.offer(44);
        pq.offer(66);

        System.out.println(pq); //min heap

        pq.poll();
        System.out.println(pq); // removes the head of the queue which was 8
    }
}