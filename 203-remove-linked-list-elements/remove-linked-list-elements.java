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
    public ListNode removeElements(ListNode head, int val) {

        if (head == null)
            return head;

        if (head.val == val)
            head = head.next;
            ListNode dummy = new ListNode(0);
            dummy.next = head;

        ListNode temp = head, pre = dummy;

        while (temp != null) {
            if (temp.val == val) {

                pre.next = temp.next;

            }else pre = temp;

            
            temp = temp.next;
        }

        return dummy.next;

    }
}