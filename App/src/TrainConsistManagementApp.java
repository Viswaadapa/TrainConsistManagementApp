import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC8 - Filter Passenger Bogies ");
        System.out.println("======================================\n");

        List<String> bogies = Arrays.asList(
                "Engine",
                "Sleeper",
                "AC Chair",
                "Cargo",
                "First Class",
                "Guard"
        );

        List<String> passengerBogies = bogies.stream()
                .filter(b -> b.equals("Sleeper") ||
                        b.equals("AC Chair") ||
                        b.equals("First Class"))
                .collect(Collectors.toList());

        System.out.println("All Bogies:");
        System.out.println(bogies);

        System.out.println("\nPassenger Bogies:");
        System.out.println(passengerBogies);
    }
}