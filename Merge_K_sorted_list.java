import java.util.PriorityQueue;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    // Helper method to create a linked list for easy testing
    ListNode next(int val) {
        this.next = new ListNode(val);
        return this.next;
    }
}
class Merge_K_sorted_list {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Push the first element from each linked list into the heap
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                minHeap.offer(new int[]{lists[i].val, i});
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (!minHeap.isEmpty()) {
            // Pop the smallest element from the heap
            int[] top = minHeap.poll();
            int val = top[0];
            int index = top[1];
            
            // Append the smallest element to the result list
            current.next = new ListNode(val);
            current = current.next;
            
            // Move to the next element in the linked list
            if (lists[index].next != null) {
                minHeap.offer(new int[]{lists[index].next.val, index});
                lists[index] = lists[index].next;
            }
        }
        
        return dummy.next;
    }
    public static void main(String[] args) {
        Merge_K_sorted_list solution = new Merge_K_sorted_list();

        // Example lists
        ListNode[] lists = {
                new ListNode(1).next(4).next(5),
                new ListNode(1).next(3).next(4),
                new ListNode(2).next(6)
        };

        // Call the mergeKLists method
        ListNode result = solution.mergeKLists(lists);
    }

}