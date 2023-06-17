import java.util.LinkedList;

public class LoopDetection {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    static Node detectCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            return slow;
        }
        return null;
    }
    public static void main(String[] args) {
        LoopDetection list = new LoopDetection();
        
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(20);
        /*    head
         *      50 --> 20 --> 15 --> 4 -->20
         *                     |           |
         *                     |___________|
         */
        head.next.next.next.next.next = head.next.next;
        Node obj = detectFirstNode(head);
        System.out.println(obj.data);
    }
}
