import java.util.Scanner;

// Box class to calculate volume
class Box {
    double width, height, depth;

    // Constructor
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

// BoxWeight class to calculate shipping cost
class BoxWeight extends Box {
    double weight;

    // Constructor
    public BoxWeight(double w, double h, double d, double wt) {
        super(w, h, d);
        weight = wt;
    }

    // Method to calculate cost of shipping
    double costToShip(double distance, double costPerKm) {
        return distance * volume() * costPerKm;
    }
}

public class BOX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the depth of the box: ");
        double depth = scanner.nextDouble();

        System.out.print("Enter the weight of the box: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter the distance in km: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the cost per km: ");
        double costPerKm = scanner.nextDouble();

        BoxWeight boxWeight = new BoxWeight(width, height, depth, weight);

        System.out.println("Volume of the box: " + boxWeight.volume());
        System.out.println("Cost to ship the box: " + boxWeight.costToShip(distance, costPerKm));

        scanner.close();
    }
}
