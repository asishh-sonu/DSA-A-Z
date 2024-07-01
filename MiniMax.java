import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        long totalSum = arr.get(0);
        int mini = arr.get(0), max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            totalSum += arr.get(i);

            if (arr.get(i) < mini) {
                mini = arr.get(i);
            }
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.print((totalSum - max) + " " + (totalSum - mini));
    }
                                                                                                                                                  
    

}

public class MiniMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
