import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC13 - Performance Comparison ");
        System.out.println("======================================\n");

        List<Integer> data = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            data.add(i);
        }

        long startLoop = System.nanoTime();

        long sumLoop = 0;
        for (int num : data) {
            if (num % 2 == 0) {
                sumLoop += num;
            }
        }

        long endLoop = System.nanoTime();

        long startStream = System.nanoTime();

        long sumStream = data.stream()
                .filter(n -> n % 2 == 0)
                .mapToLong(n -> n)
                .sum();

        long endStream = System.nanoTime();

        System.out.println("Loop Result: " + sumLoop);
        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");

        System.out.println("\nStream Result: " + sumStream);
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");
    }
}