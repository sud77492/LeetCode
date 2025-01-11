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
         ListNode dummyhead = new ListNode(0);
        ListNode l3 = dummyhead;
        int carry = 0;
        while(l1!=null || l2!=null){
            int val1 = l1 != null ? l1.val:0;
            int val2 = l2 != null ? l2.val:0;
            int sum = carry + val1 + val2;
            carry = sum/10;
            int finalVal = sum%10;
            ListNode sumData = new ListNode(finalVal);
            l3.next = sumData;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            l3 = l3.next;

        }
        if(carry > 0){
            ListNode carryFinal = new ListNode(carry);
            l3.next = carryFinal;
            l3 = l3.next;
        }

        return dummyhead.next;
    }
}