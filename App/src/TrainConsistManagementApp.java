import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC5 - Preserve Insertion Order ");
        System.out.println("======================================\n");

        // LinkedHashSet preserves insertion order + uniqueness
        Set<String> bogies = new LinkedHashSet<>();

        // Add bogies (with duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (ignored but order preserved)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display result
        System.out.println("Bogie IDs in insertion order:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are ignored, but insertion order is preserved.");

        System.out.println("\nUC5 completed successfully...");
    }
}