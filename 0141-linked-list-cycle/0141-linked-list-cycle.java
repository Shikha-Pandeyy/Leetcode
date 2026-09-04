/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) 
            return false;

        ListNode slow = head;
        ListNode tej = head;

        while(tej != null && tej.next != null){
            slow = slow.next;
            tej = tej.next.next;

            if(slow == tej){
                return true;
            }
        }
        return false;
    }
}