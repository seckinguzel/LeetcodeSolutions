package _14LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { //While we cannot find the prefix for this example it is "flower".
                prefix = prefix.substring(0, prefix.length() - 1); //It will decrease the size of the string. So it will be like that, first it will check for "flow" so process will be like that "flower"->"flowe"->"flow" in this step prefix is "flow". Then loop will continue, now prefix will be check for "flight" so the process will be like that "flow"->"flo"->"fl" and finish.
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
