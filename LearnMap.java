import java.util.HashMap;
import java.util.Map;

public class LearnMap{
    public static void main(String args[]){
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1 );
        numbers.put("Two", 2 );
        numbers.put("Three", 3 );
        numbers.put("Four", 4 );
        System.out.println(numbers);
    }
}