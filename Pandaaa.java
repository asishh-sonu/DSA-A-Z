class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private double gpa;

    public Student(String name, int age, double gpa) {
        // Call superclass constructor to initialize name and age
        super(name, age);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}

public class Pandaaa {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 3.8);
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student GPA: " + student.getGpa());
    }
}
