package LinkedList;

public class RemoveNthNodeFromEnd extends ListNode {
    ListNode head;

    public ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode node1 = head, node2 = head;
        int count = 1;

        while (node1 != null) {
            if (count == (n + 1)) {
                break;
            }
            count += 1;
            node1 = node1.next;
        }


        if (count == (n + 1)) {
            while (node1 != null) {
                node1 = node1.next;
                node2 = node2.next;
            }
            return node2;

        }
        return node1;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd obj=new RemoveNthNodeFromEnd();
        obj.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth =new ListNode(4);
        ListNode fifth =new ListNode(5);
        ListNode sixth =new ListNode(6);
        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        System.out.println(obj.removeNthFromEnd(obj.head,2));
    }
}
