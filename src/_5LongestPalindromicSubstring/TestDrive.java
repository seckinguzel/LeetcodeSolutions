/*
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.
*/

package _5LongestPalindromicSubstring;

public class TestDrive {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        System.out.println(solution.longestPalindrome("babad"));

        // Example 2
        System.out.println(solution.longestPalindrome("cbbd"));
    }
}
