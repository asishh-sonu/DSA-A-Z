public class StringAccenture{
    public static void main(String args[]){
    int n =3;
    String str = "abc";
    StringBuilder result = new StringBuilder();
    for(int i = 0;i<n;i++){
        result.append(str);
    }
    System.out.println(result.toString());
    }
}