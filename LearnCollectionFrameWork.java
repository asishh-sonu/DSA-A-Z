import java.util.ArrayList;
import java.util.List;

public class LearnCollectionFrameWork{
    public static void main(String args[]){
     
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  
        System.out.println(list);

        list.add(1,50);   // 50 added in the 1st index
        System.out.println(list);

        List<Integer> newList = new ArrayList(); // new list added
        newList.add(100);
        newList.add(200);

        list.addAll(newList);  // combination of two lists
        System.out.println(list);

        System.out.println(list.get(2));  // get an element from the list


        
    }
}