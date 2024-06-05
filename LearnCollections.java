import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollections{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(94);
        list.add(9);
        list.add(76);
        list.add(29);
        System.out.println("min element " + Collections.min(list));
        System.out.println("Max element " + Collections.max(list));
        System.out.println(Collections.frequency(list,9));

        Collections.sort(list);
        System.out.println(list); //sortting
    }
}