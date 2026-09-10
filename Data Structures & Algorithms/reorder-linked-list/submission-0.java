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
    public void reorderList(ListNode head) {
        List<ListNode> org = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            org.add(curr);
            curr = curr.next;
        }

        curr = head;
        for (int i = 1; i <= org.size() / 2; i++) {
            curr.next = org.get(org.size() - i);
            curr = curr.next;

            if (i == org.size() / 2 && org.size() % 2 == 0) {
                break;
            }
            
            curr.next = org.get(i);
            curr = curr.next;
        }
        curr.next = null;



    }
}