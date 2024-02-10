import java.util.Scanner;

public class BookingManager {
    private static boolean[] rooms = new boolean[10]; // Assume 10 rooms

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n1. Book a room");
            System.out.println("2. Check room availability");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    bookRoom(scanner);
                    break;
                case 2:
                    checkAvailability();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
        
        scanner.close();
    }

    private static void bookRoom(Scanner scanner) {
        System.out.print("Enter room number (1-10): ");
        int roomNumber = scanner.nextInt();
        
        if (roomNumber < 1 || roomNumber > 10) {
            System.out.println("Invalid room number!");
            return;
        }
        
        if (rooms[roomNumber - 1]) {
            System.out.println("Room " + roomNumber + " is already booked.");
        } else {
            rooms[roomNumber - 1] = true;
            System.out.println("Room " + roomNumber + " booked successfully.");
        }
    }

    private static void checkAvailability() {
        System.out.println("Room availability:");
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Room " + (i + 1) + ": " + (rooms[i] ? "Booked" : "Available"));
        }
    }
}
