import java.util.PriorityQueue;
import java.util.Scanner;

public class test {

    static int minStepsToTargetSweetness(int[] candies, int targetSweetness) {
        // Convert candies to a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int candy : candies) {
            minHeap.offer(candy);
        }

        int steps = 0;

        while (minHeap.peek() < targetSweetness) {
            // Extract the two least sweet candies
            int leastSweet = minHeap.poll();
            int secondLeastSweet = minHeap.poll();

            // Calculate the sweetness of the combined candy
            int combinedSweetness = leastSweet + 2 * secondLeastSweet;

            // Add the combined candy back to the heap
            minHeap.offer(combinedSweetness);

            // Increment the number of steps
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter target sweetness:");
        int targetSweetness = scanner.nextInt();

        System.out.println("Enter candies sweetness separated by spaces:");
        int n = scanner.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }

        // Output the result
        int result = minStepsToTargetSweetness(candies, targetSweetness);
        System.out.println(result);
    }
}
