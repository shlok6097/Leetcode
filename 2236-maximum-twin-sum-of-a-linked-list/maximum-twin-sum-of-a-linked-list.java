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
    public int pairSum(ListNode head) {

        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        int sum =0;
        temp = head;
        while(temp != null){
            int nodeSum = temp.val + st.pop();

            if(nodeSum > sum){
                sum = nodeSum;
            }
            temp = temp.next;
        }

        return sum;
        
    }
}