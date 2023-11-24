import java.util.Arrays;
public class H_index_Q274 {
    public static int calculateHIndex(int[] citations) {
        // Sort the array in ascending order
        Arrays.sort(citations);

        int n = citations.length;
        int hIndex = 0;

        // Iterate from the end of the sorted array
        for (int i = n - 1; i >= 0; i--) {
            // Compare the number of citations with the position in the sorted array
            // If the number of citations is greater than or equal to the position, update the hIndex
            if (citations[i] >= n - i) {
                hIndex = n - i;
            } else {
                // If the number of citations is less than the position, break the loop
                break;
            }
        }

        return hIndex;
    }

    public static void main(String[] args) {
        // Example 1
        int[] citations1 = {3, 0, 6, 1, 5};
        System.out.println("Example 1 Output: " + calculateHIndex(citations1));

        // Example 2
        int[] citations2 = {1, 3, 1};
        System.out.println("Example 2 Output: " + calculateHIndex(citations2));
    }
}


