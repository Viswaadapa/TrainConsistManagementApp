import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("======================================\n");

        String trainId = "TR123";
        List<String> cargoCodes = Arrays.asList("CG01", "CG02", "INVALID", "CG03");

        boolean isTrainValid = trainId.matches("TR\\d{3}");

        System.out.println("Train ID: " + trainId);
        System.out.println("Is Train ID Valid? " + isTrainValid);

        System.out.println("\nCargo Code Validation:");

        for (String code : cargoCodes) {
            if (code.matches("CG\\d{2}")) {
                System.out.println(code + " -> Valid");
            } else {
                System.out.println(code + " -> Invalid");
            }
        }
    }
}