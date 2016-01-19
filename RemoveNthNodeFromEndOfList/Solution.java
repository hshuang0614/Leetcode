/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int l = length(head) - n; 
        
        ListNode ptr = head; 
        
        ListNode prev = null; 
        
        while (head != null && l-- > 0) {
            prev = head; 
            head = head.next;
        }
        
 
        if (prev != null) {
            prev.next = head.next; 
        } 
        
        else ptr = head.next;
        
        return ptr; 
    }
    
    private int length(ListNode h) {
        return (h == null)? 0 : 1 + length(h.next); 
    }
}