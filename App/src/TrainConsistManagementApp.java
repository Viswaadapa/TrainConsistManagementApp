import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC10 - Total Seat Count ");
        System.out.println("======================================\n");

        List<Integer> capacities = Arrays.asList(72, 60, 40, 90);

        int totalSeats = capacities.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Seat Capacities:");
        System.out.println(capacities);

        System.out.println("\nTotal Seats in Train:");
        System.out.println(totalSeats);
    }
}