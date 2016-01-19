/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy; 
        int carry = 0, sum = 0; 
        
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; 
            }
            
            ListNode n = new ListNode((sum + carry) % 10); 
            curr.next = n; 
            carry = (sum + carry) >= 10? 1: 0;
            sum = 0;
            curr = curr.next;
        }
        
        if (carry == 1) {
            ListNode n = new ListNode(1); 
            curr.next = n;
        }
        
        return dummy.next;
        
    }
}