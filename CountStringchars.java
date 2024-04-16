public class CountStringchars {
    public static void main(String args[]) {
        String s = "My name is Asish";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
