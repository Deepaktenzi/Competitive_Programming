/**
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * 
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
    public ListNode reverseList(ListNode head) {

        ListNode node = null;
        while(head!=null){
        ListNode nextNode = head.next;
        head.next = node;
        node = head;
        head = nextNode;
    }
        return node;
    }
}