package roombooking;

import java.util.ArrayList;
import java.util.Scanner;

class Room {
    private String roomID = null;
    private boolean booked = false;

    Room(String roomID) {
        this.roomID = roomID;
    }

    String getRoomID() {
        return roomID;
    }

    void cancel() {
        booked = false;
    }

    boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}

class RoomDB {
    private ArrayList<Room> room;
    private String[] roomID = {"Room1", "Room2"};

    RoomDB() {
        room = new ArrayList<Room>();
        for (int i = 0; i < roomID.length; i++) {
            addRoom(new Room(roomID[i]));
        }
    }

    public void addRoom(Room addRoom) {
        room.add(addRoom);
    }

    public ArrayList<Room> getRoom() {
        return room;
    }
}

public class Booking {
    static RoomDB roomDB = new RoomDB();

    public static void main(String[] args) {
        String roomID;
        Room room;
        Scanner inputID = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose the room you want to book:\n" + getRoomList(roomDB));
            while (true) {
                System.out.println("Enter your Room no. (Enter x to quit): ");
                roomID = inputID.nextLine();
                if (roomID.equals("x")) {
                    break;
                }
                if (getRoom(roomID) == null) {
                    System.out.println("The room ID is incorrect. Please enter again or enter x to quit.");
                } else {
                    room = getRoom(roomID);
                    if (!room.isBooked()) {
                        System.out.println("Book successfully");
                        room.setBooked(true);
                        break;
                    } else {
                        System.out.println("Please enter the room ID again or enter x to quit.");
                    }
                }
            }
        }
    }

    public static String getRoomList(RoomDB roomDB) {
        String roomList = "";
        for (Room r : roomDB.getRoom()) {
            if (!r.isBooked()) {
                roomList = roomList + r.getRoomID() + " is free ";
            } else {
                roomList = roomList + r.getRoomID() + " has been booked ";
            }
        }
        return roomList;
    }

    public static Room getRoom(String roomID) {
        for (Room r : roomDB.getRoom()) {
            if (r.getRoomID().equals(roomID)) {
                return r;
            }
        }
        return null;
    }
}
