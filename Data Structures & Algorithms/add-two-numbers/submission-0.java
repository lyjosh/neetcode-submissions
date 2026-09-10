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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode r = addTwoNumbers(l1,l2, 0);
        return r;
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null && carry ==0){
            return null;
        } else if(l1 == null && l2 == null){
            return new ListNode(carry);
        } else if(l1 == null){
            return new ListNode((l2.val+carry) %10, addTwoNumbers(null, l2.next, (l2.val+carry)/10 ));
        } else if(l2 == null){
            return new ListNode((l1.val+carry) %10, addTwoNumbers(l1.next, null, (l1.val+carry)/10 ));
        } else {
            int sum = l1.val + l2.val + carry;
            int actAdd = sum % 10;
            int rem = sum / 10;
            return new ListNode(actAdd, addTwoNumbers(l1.next,l2.next, rem));
            
        }

    }
}
