import java.util.Stack;

public class Minimum  {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean[] valid = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    valid[stack.pop()] = true;
                    valid[i] = true;
                } else {
                    valid[i] = false;
                }
            } else {
                valid[i] = true;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (valid[i]) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "lee(t(c)o)de)";
        System.out.println(solution.minRemoveToMakeValid(s)); // Output: "lee(t(c)o)de"
    }
}
