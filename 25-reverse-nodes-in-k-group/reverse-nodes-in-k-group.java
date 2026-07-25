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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode kthNode = kThNode(temp, k);
            if (kthNode == null) {
                if (prev != null) {
                    prev.next = temp;
                   
                }
                 break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            revarse(temp);
            if (temp == head) {
                head = kthNode;
            } else {
                prev.next = kthNode;
            }
            prev = temp;
            temp = nextNode;

        }
        return head;

    }

    private ListNode revarse(ListNode head) {
        ListNode temp = head, prev = null;

        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }

    private ListNode kThNode(ListNode head, int k) {
        ListNode temp = head;

        while (temp != null && k>1) {
            k--;
            temp = temp.next;
        }
        return temp;
    }
}