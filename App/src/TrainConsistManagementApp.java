import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("======================================\n");

        List<String> bogies = Arrays.asList(
                "Engine",
                "Sleeper",
                "AC Chair",
                "Cargo",
                "First Class",
                "Cylindrical",
                "Guard"
        );

        Map<String, List<String>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> {
                    if (b.equals("Sleeper") || b.equals("AC Chair") || b.equals("First Class")) {
                        return "Passenger";
                    } else if (b.equals("Cargo") || b.equals("Cylindrical")) {
                        return "Goods";
                    } else {
                        return "Other";
                    }
                }));

        System.out.println("Grouped Bogies:");
        for (Map.Entry<String, List<String>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}