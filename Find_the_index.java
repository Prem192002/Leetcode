
class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}
public class Find_the_index {
    public static boolean detectLoop(Node head){
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

    public static void main(String[] args) {
        // Test Case 1: Loop exists
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(4);
        head1.next.next.next = head1.next;
        System.out.println("Loop exists: " + detectLoop(head1)); // Output: true

        // Test Case 2: No loop
        Node head2 = new Node(1);
        head2.next = new Node(8);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        System.out.println("Loop exists: " + detectLoop(head2)); // Output: false
    }
}
