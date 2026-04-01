import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("======================================\n");

        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);
        bogieCapacity.put("General", 90);

        List<Map.Entry<String, Integer>> bogieList =
                new ArrayList<>(bogieCapacity.entrySet());

        bogieList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> b1,
                               Map.Entry<String, Integer> b2) {
                return b1.getValue().compareTo(b2.getValue());
            }
        });

        System.out.println("Bogies sorted by capacity:");
        for (Map.Entry<String, Integer> entry : bogieList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}