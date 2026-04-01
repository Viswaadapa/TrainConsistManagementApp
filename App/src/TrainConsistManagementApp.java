import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("======================================\n");

        // Create HashMap: Bogie -> Capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add entries
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display all bogies with capacity
        System.out.println("Bogie Capacity Mapping:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Access specific bogie
        System.out.println("\nCapacity of Sleeper: " + bogieCapacity.get("Sleeper"));

        // Check existence
        if (bogieCapacity.containsKey("AC Chair")) {
            System.out.println("AC Chair bogie exists in mapping.");
        }

        // Remove a bogie
        bogieCapacity.remove("First Class");

        System.out.println("\nAfter removing First Class:");
        System.out.println(bogieCapacity);
    }
}