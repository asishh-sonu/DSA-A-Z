import java.util.*;

public class Dmda {
    public static String frequencySort(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));
        queue.addAll(count.keySet());

        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            char c = queue.remove();
            for (int i = 0; i < count.get(c); i++) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));  // Example usage
    }
}
