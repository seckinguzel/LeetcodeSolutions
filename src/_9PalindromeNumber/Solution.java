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
