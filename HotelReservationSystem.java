import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

    private static ArrayList<Room> rooms; // List of hotel rooms

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rooms = createRoomData(); // Placeholder for populating room data (replace with database interaction)

        int choice;

        do {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Search Rooms");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    searchRooms();
                    break;
                case 2:
                    System.out.println("Exiting Hotel Reservation System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 2);

        scanner.close(); // Close Scanner to avoid resource leaks
    }

    private static void searchRooms() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter check-in date (YYYY-MM-DD): ");
        String checkInDate = scanner.nextLine();
        System.out.print("Enter check-out date (YYYY-MM-DD): ");
        String checkOutDate = scanner.nextLine();

        ArrayList<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable(checkInDate, checkOutDate)) {
                availableRooms.add(room);
            }
        }

        if (availableRooms.isEmpty()) {
            System.out.println("No rooms available for your selected dates.");
        } else {
            System.out.println("\nAvailable Rooms:");
            for (Room room : availableRooms) {
                System.out.println(room);
            }
        }
    }

    private static ArrayList<Room> createRoomData() {
        // Placeholder for populating room data from a database (replace with actual database interaction)
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, "Single", 100.00, true));
        rooms.add(new Room(102, "Double", 150.00, true));
        rooms.add(new Room(201, "Suite", 200.00, false));
        return rooms;
    }
}

class Room {
    private int number;
    private String type;
    private double price;
    private boolean available; // Flag for room availability

    public Room(int number, String type, double price, boolean available) {
        this.number = number;
        this.type = type;
        this.price = price;
        this.available = available;
    }

    public boolean isAvailable(String checkInDate, String checkOutDate) {
        // Placeholder for checking availability against bookings in a database (replace with actual logic)
        return available;
    }

    @Override
    public String toString() {
        return "Room Number: " + number + ", Type: " + type + ", Price: $" + price + (available ? " (Available)" : " (Unavailable)");
    }
}
