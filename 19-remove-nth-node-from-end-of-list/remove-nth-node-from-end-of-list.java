/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //     if(head==null){
    //        return head;
    //     }
    //     if(n==1){
    //         ListNode temp = head;
    //         head = head.next;
    //         return head;
    //     }
    //     int count=0;
    //     ListNode temp =head,prev=null,temp2=head;


    //     int len =0;
    //     while(temp2 != null){
    //         len++;
    //         temp2= temp2.next;
    //     }
      

    //     while(temp != null){
    //         count++;

    //         if(count == (len+1-n)){
    //             prev.next= prev.next.next;
    //             break;

    //         }
    //         prev = temp;
    //         temp = temp.next;
    //     }

    //     return head;
        ListNode dummy= new ListNode(0);
        dummy.next= head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next= slow.next.next;

        return dummy.next;

    

        
    }
}