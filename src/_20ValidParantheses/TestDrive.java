/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 */

package _20ValidParantheses;

public class TestDrive {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String s1 = "()";
        boolean result1 = solution.isValid(s1);
        System.out.println("Example 1: " + result1);  // Output: true

        // Example 2
        String s2 = "()[]{}";
        boolean result2 = solution.isValid(s2);
        System.out.println("Example 2: " + result2);  // Output: true

        // Example 3
        String s3 = "(]";
        boolean result3 = solution.isValid(s3);
        System.out.println("Example 3: " + result3);  // Output: false

        // Additional Test Case
        String s4 = "([}}])";
        boolean result4 = solution.isValid(s4);
        System.out.println("Additional Test Case: " + result4);  // Output: false
    }
}
