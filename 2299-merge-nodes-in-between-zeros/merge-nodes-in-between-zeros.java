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
    public ListNode mergeNodes(ListNode head) {

        ListNode dummy = new ListNode(-1);

        ListNode temp = head.next, ans = dummy;
        while (temp != null) {

            int sum = 0;
            while (temp.next != null && temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }
            ans.next = new ListNode(sum);
            ans = ans.next;

            if (temp != null)
                temp = temp.next;
        }
        return dummy.next;
    }
}