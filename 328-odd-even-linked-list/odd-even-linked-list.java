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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next ==null) return head;

        ListNode evan= head.next,evanHead= head.next;
        ListNode odd = head;

        while(evan !=null && evan.next != null){
            odd.next= odd.next.next;
            evan.next= evan.next.next;

            odd = odd.next;
            evan = evan.next;
        }
        odd.next =evanHead;

        return head;


        //Breutefore

       /* 

        ArrayList<Integer> ans = new ArrayList<>();

        ListNode temp =head;

        while(temp != null && temp.next != null){
            ans.add(temp.val);
            temp = temp.next.next;
        }
        if(temp!=null) ans.add(temp.val);

          temp =head.next;

        while(temp != null && temp.next != null){
            ans.add(temp.val);
            temp = temp.next.next;
        }
        if(temp!=null) ans.add(temp.val);

        temp = head;
        int i=0;

        while(temp !=null ){
            if(temp.val != ans.get(i)){
                temp.val = ans.get(i);
            }
            i++;
            temp = temp.next;
        }

        return head;*/


        
        
    }
}