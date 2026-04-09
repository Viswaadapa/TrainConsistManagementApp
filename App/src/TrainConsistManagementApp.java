import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC20 - Safe Search with Validation ");
        System.out.println("======================================\n");

        List<String> bogieIds = new ArrayList<>();

        String searchKey = "BG101";

        try {

            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("No bogies available for search");
            }

            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie ID " + searchKey + " found.");
            } else {
                System.out.println("Bogie ID " + searchKey + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}