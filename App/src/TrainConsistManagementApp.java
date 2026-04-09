public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("======================================\n");

        String[] bogieIds = {"BG101", "BG102", "BG103", "BG104", "BG105"};

        String searchKey = "BG103";

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}