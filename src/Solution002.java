/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *

 */
 class Solution002 {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
     }

     public ListNode add(ListNode l1,ListNode l2,int a){
         if (l1==null&&l2==null&&a==0) return null;
         int x = l1==null ? 0 : l1.val;
         int y = l2==null ? 0 : l2.val;
         int sum = x+y+a;
         ListNode result = new ListNode(sum%10);
         result.next = add(l1==null?null:l1.next,l2==null?null:l2.next,sum/10);
         return result;
     }
 }