import java.util.ArrayList;
import java.util.List;

public class LearningArrayList{
    public static void main(String args[]){

        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(01);
        list.add(12);
        list.add(130);
        list.add(133);
        list.add(163);
        list.add(25);
        list.add(60);
        list.add(80);

        System.out.println(list);

        for(int i = 0; i<list.size(); i++){
            System.out.println("The elements are " + list.get(i));
        }

    //     list.remove(2);    //This will remove the index from the list
    //     System.out.println(list);

    //     // list.clear();
    //     // System.out.println(list);  //This will remove the list

    //     list.set(1, 500);   //This will update the list
    //     System.out.println(list);

    //     System.out.println(list.contains(12));  //This will check , if a elemet is present in the list or not
    // }
    }
}