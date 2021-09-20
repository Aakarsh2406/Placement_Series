package LinkedList;

import java.util.List;

class ListNode {
     int val;
 ListNode next;
 ListNode() {}ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class MiddleOfList {
     ListNode head;
 static    public ListNode middleNode(ListNode head) {
        ListNode fast_pointer = head;
        ListNode slow_pointer=head;
        while (fast_pointer!=null && fast_pointer.next!=null)
        {
            fast_pointer=fast_pointer.next.next;
            slow_pointer=slow_pointer.next;
        }
return slow_pointer;
    }



    public static void main(String[] args){
     MiddleOfList obj=new MiddleOfList();
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
        ListNode ans=middleNode(obj.head);
       while (ans!=null)
       {
           System.out.print(ans.val+" ");
           ans=ans.next;
       }

    }
}
