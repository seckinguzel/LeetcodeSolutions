/*
    Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".

    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
 */

package _14LongestCommonPrefix;

public class TestDrive {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String[] strs1 = {"flower", "flow", "flight"};
        String result1 = solution.longestCommonPrefix(strs1);
        System.out.println("Example 1: " + result1);  // Output: "fl"

        // Example 2
        String[] strs2 = {"dog", "racecar", "car"};
        String result2 = solution.longestCommonPrefix(strs2);
        System.out.println("Example 2: " + result2);  // Output: ""

        // Additional Test Case
        String[] strs3 = {"apple", "apricot", "apology"};
        String result3 = solution.longestCommonPrefix(strs3);
        System.out.println("Additional Test Case: " + result3);  // Output: "ap"
    }
}
