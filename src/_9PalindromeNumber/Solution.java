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

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String orginal = Integer.toString(x);
        String reversed = new StringBuilder(orginal).reverse().toString();
        return orginal.equals(reversed);
    }
}
