/*
    Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".

    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
 */

package _14LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { //While indexOf the prefix string is not equal to zero. The indexOf() method returns the first index at which a specified element can be found in an array, or -1 if the element is not present.
                prefix = prefix.substring(0, prefix.length() - 1); //While we cannot find the prefix at the begining of the array, for this example it is "flower" then it is going to decrease the size of the string. So it will be like that "flower"->"flowe"->"flow" then it is going to stop when until finish the loop.
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}