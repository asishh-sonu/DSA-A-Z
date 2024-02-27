// Shape class as the super class
class Shape {
    // Method to find area (to be overridden by subclasses)
    public void findArea() {
        System.out.println("Area calculation not implemented for generic shape.");
    }
}

// Square class inheriting from Shape
class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Method to find area of square
    @Override
    public void findArea() {
        double area = side * side;
        System.out.println("Area of square with side " + side + " is: " + area);
    }
}

// Rectangle class inheriting from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to find area of rectangle
    @Override
    public void findArea() {
        double area = length * width;
        System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + area);
    }
}

public class UUU {
    public static void main(String[] args) {
        // Creating objects of Square and Rectangle
        Shape square = new Square(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Finding and displaying areas
        square.findArea();
        rectangle.findArea();
    }
}
