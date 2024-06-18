public class judgeSquareSum {
    public boolean judge(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c); 
        while (a <= b) { 
            long t = a * a + b * b;
            if (t == c) {
                return true;
            } else if (t < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }
}
