import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class top_k_frequent_numbers_Q347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int num : nums) {
            frequencies.putIfAbsent(num, 0);
            frequencies.put(num, frequencies.get(num) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            pq.add(entry);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}
