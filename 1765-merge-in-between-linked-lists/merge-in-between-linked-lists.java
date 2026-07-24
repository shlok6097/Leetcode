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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        int count =0;
        ListNode temp = list1,prev = list1;

        while(temp != null){
            if(count < a){
                prev = temp;
                
            }
            if(count > b){
                ListNode t1 = list2;
                while(t1.next != null){
                    t1 = t1.next;
                }
                prev.next = list2;
                t1.next = temp;
                break;
            }
            count++;
            temp = temp.next;

        }
        return list1;
        
    }
}