import java.util.*;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        findZigZagSequence(a, n);

        System.out.println("ZigZag Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void findZigZagSequence(int[] a, int n) {
        // Sort the array
        Arrays.sort(a);

        // Find the middle index
        int mid = (n + 1) / 2;

        // Swap pairs from the second element to the middle element
        for (int i = 1; i < mid; i++) {
            int temp = a[i];
            a[i] = a[n - i];
            a[n - i] = temp;
        }
    }
}
