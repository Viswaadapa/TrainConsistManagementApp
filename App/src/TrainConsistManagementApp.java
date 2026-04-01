import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("======================================\n");

        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", -10);
        bogieCapacity.put("First Class", 0);

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            String bogie = entry.getKey();
            int capacity = entry.getValue();

            try {
                if (capacity <= 0) {
                    throw new IllegalArgumentException("Invalid capacity");
                }

                System.out.println(bogie + " -> Capacity: " + capacity);

            } catch (IllegalArgumentException e) {
                System.out.println(bogie + " -> ERROR: " + e.getMessage());
            }
        }
    }
}