import java.util.ArrayList;
import java.util.Scanner;

public class TravelItineraryPlanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> destinations = new ArrayList<>();
        String startDate, endDate;

        System.out.println("Welcome to Travel Itinerary Planner!");

        // Get destinations
        System.out.println("Enter your travel destinations (separate by commas or enter 'done'):");
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("done")) {
            destinations.add(input);
            System.out.print("Next destination (or 'done'): ");
            input = scanner.nextLine();
        }

        // Get travel dates
        System.out.print("Enter start date (YYYY-MM-DD): ");
        startDate = scanner.nextLine();
        System.out.print("Enter end date (YYYY-MM-DD): ");
        endDate = scanner.nextLine();

        // Display summary (placeholder for itinerary generation)
        System.out.println("\nYour Itinerary Summary:");
        System.out.println("Destinations: " + destinations);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);

        scanner.close(); // Close Scanner to avoid resource leaks
    }
}
