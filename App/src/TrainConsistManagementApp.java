public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("======================================\n");

        String[] bogieIds = {"BG101", "BG102", "BG103", "BG104", "BG105"};

        String searchKey = "BG104";

        int low = 0;
        int high = bogieIds.length - 1;

        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(searchKey);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}