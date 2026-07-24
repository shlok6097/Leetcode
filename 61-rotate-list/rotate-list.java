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
    public ListNode rotateRight(ListNode head, int k) {

        if(head== null)return null;

        ListNode tail= head;
        int len = 1;

        while(tail.next != null){
            len++;
            tail = tail.next;
        }
       
         k= k%len;
        if(k  ==0) return head;
         tail.next = head;
       

        ListNode newTail = findLastNode(head,len-k-1);
        head = newTail.next;

        newTail.next = null;

        return head;
    }
    public ListNode findLastNode(ListNode head,int k){
        ListNode temp = head;

        for(int i =0;i<k;i++){
            temp = temp.next;

        }
        return temp;

    }
}