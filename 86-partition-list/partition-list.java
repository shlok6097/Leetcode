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
    public ListNode partition(ListNode head, int x) {
        ListNode d1= new ListNode(-1);
        ListNode d2 = new ListNode(-1);

        ListNode stNode = d1,edNode= d2,temp = head;

        while(temp != null){
            if(temp.val >= x){
                d2.next = temp;
                d2 = temp;
            }else{
                d1.next = temp;
                d1 = temp;
            }
            temp = temp.next;
        }
        d2.next = null;
        if(edNode.next != null){
            d1.next = edNode.next;
        }

        return stNode.next;
        
    }
}