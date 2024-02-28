package _7ReverseInteger;

public class Solution {
    public int reverse(int x) {
        String str = Integer.toString(x);
        StringBuilder reversed = new StringBuilder();

        if (str.charAt(0) == '-') {
            reversed.append('-');
            str = str.substring(1); // Remove negative symbol
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        try {
            return Integer.parseInt(reversed.toString());
        } catch (NumberFormatException e) {
            return 0; // Check out of 32-bit boundaries
        }
    }
}
