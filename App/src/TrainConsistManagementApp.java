import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("======================================\n");

        Map<String, String> goodsBogies = new HashMap<>();

        goodsBogies.put("BG201", "Coal");
        goodsBogies.put("BG202", "Chemicals");
        goodsBogies.put("BG203", "Food");
        goodsBogies.put("BG204", "Explosives");

        System.out.println("Safety Compliance Report:\n");

        for (Map.Entry<String, String> entry : goodsBogies.entrySet()) {

            String bogieId = entry.getKey();
            String cargo = entry.getValue();

            if (cargo.equalsIgnoreCase("Explosives") || cargo.equalsIgnoreCase("Chemicals")) {
                System.out.println(bogieId + " carrying " + cargo + " -> NOT SAFE");
            } else {
                System.out.println(bogieId + " carrying " + cargo + " -> SAFE");
            }
        }
    }
}