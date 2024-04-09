import java.util.ArrayList;
import java.util.List;

public class LearnArrayList{
    public static void main(String args[]){
        List<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);

        list.add(2, 20);
        System.out.println(list);

        List<Integer> newList = new ArrayList();   //creating a new array list
        newList.add(150);
        newList.add(200);

        list.addAll(newList);  //This will add all the elements in the list
        System.out.println(list); 

        System.out.println(list.get(3));  //get elemets from array list

    }
}