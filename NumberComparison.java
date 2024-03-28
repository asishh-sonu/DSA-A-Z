public class NumberComparison {

  public static void main(String[] args) {
    // Comparing primitive data types (int)
    int num1 = 10;
    int num2 = 20;

    if (num1 == num2) {
      System.out.println("num1 and num2 are equal");
    } else if (num1 > num2) {
      System.out.println("num1 is greater than num2");
    } else {
      System.out.println("num2 is greater than num1");
    }

    // Comparing objects (Integer)
    Integer num3 = new Integer(10);
    Integer num4 = new Integer(10);

    if (num3.equals(num4)) {  // Comparing values, not object references
      System.out.println("num3 and num4 are equal (same value)");
    } else {
      System.out.println("num3 and num4 are not equal (different objects)");
    }
  }
}
