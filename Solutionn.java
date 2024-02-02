import java.util.ArrayList;
import java.util.List;

public class Solutionn {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(100, 300));
    }

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        for (int digit = 1; digit < 9; ++digit) {
            int next = digit, n = next;
            while (n <= high && next < 10) {
                if (n >= low) {
                    res.add(n);
                }
                int n1 = n * 10 + ++next;
                if (n1 > n) {
                    n = n1;
                } else {
                    break;
                }
            }
        }
        res.sort(null);
        return res;
    }
}
