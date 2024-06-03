import java.util.Stack;

public class LearnStack{
    public static void main(String args[]){
        Stack<String> animals = new Stack<>();

        animals.push("Panda");
        animals.push("Cat");
        animals.push("Cow");
        animals.push("tiger");
        animals.push("Lion");

        System.out.println("Stack:" + animals); //push the elements to the stack
    }
}