/*
    Given an integer x, return true if x is a  palindrome , and false otherwise.

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

package _9PalindromeNumber;

public class TestDrive {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int x1 = 121;
        boolean result1 = solution.isPalindrome(x1);
        System.out.println("Example 1: " + result1);  // Output: true

        // Example 2
        int x2 = -121;
        boolean result2 = solution.isPalindrome(x2);
        System.out.println("Example 2: " + result2);  // Output: false

        // Example 3
        int x3 = 10;
        boolean result3 = solution.isPalindrome(x3);
        System.out.println("Example 3: " + result3);  // Output: false

        // Additional Test Case
        int x4 = 1221;
        boolean result4 = solution.isPalindrome(x4);
        System.out.println("Additional Test Case: " + result4);  // Output: true
    }
}
