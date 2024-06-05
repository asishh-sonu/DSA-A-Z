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
        
        set.remove(36);
        System.out.println(set); // It will remove the element form the Set

        System.out.println(set.contains(225)); //It will the cheeck the element is present in the set or not

        System.out.println(set.isEmpty()); //It will check the set is emepty or not
    }
}