/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/

package _2AddTwoNumbers;

public class TestDrive {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result1 = solution.addTwoNumbers(l1, l2);
        printList(result1);  // Output: 7 -> 0 -> 8

        // Example 2
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode result2 = solution.addTwoNumbers(l3, l4);
        printList(result2);  // Output: 0

        // Example 3
        ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result3 = solution.addTwoNumbers(l5, l6);
        printList(result3);  // Output: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
        /*
        The printList method is used to display the contents of a linked list in a readable format
        for testing purposes. It traverses the linked list starting from the given head node and
        prints each node's value followed by an arrow (->). The method continues this process until it reaches
        the end of the list, where it prints "null" to signify the end of the linked list.
        */
    }
}
