import java.util.Scanner;

class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double calculateVolume() {
        return width * height * depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}

class BoxWeight {
    private Box box;
    private double costPerKm;

    public BoxWeight(Box box, double costPerKm) {
        this.box = box;
        this.costPerKm = costPerKm;
    }

    public double calculateShippingCost(double distanceInKm) {
        double volume = box.calculateVolume();
        return distanceInKm * volume * costPerKm;
    }
}

public class BoxShipping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the depth of the box: ");
        double depth = scanner.nextDouble();

        System.out.print("Enter the cost per km: ");
        double costPerKm = scanner.nextDouble();

        Box box = new Box(width, height, depth);
        BoxWeight boxWeight = new BoxWeight(box, costPerKm);

        System.out.print("Enter the distance in km: ");
        double distanceInKm = scanner.nextDouble();

        double shippingCost = boxWeight.calculateShippingCost(distanceInKm);
        System.out.println("Volume of the box: " + box.calculateVolume() + " cubic units");
        System.out.println("Cost to ship the box: " + shippingCost);
    }
}
