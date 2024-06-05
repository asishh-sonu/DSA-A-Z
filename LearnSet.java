import java.util.HashSet;
import java.util.Set;
public class LearnSet{
    public static void main(String args[]){
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(225);
        set.add(36);
        set.add(63);
        set.add(96);

        System.out.println(set); //Elements added into the Set

    }
}