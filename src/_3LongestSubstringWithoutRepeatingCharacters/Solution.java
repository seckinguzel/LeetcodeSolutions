package _3LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndex = new HashMap<>();

        int maxLength = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currentChar = s.charAt(endIndex);

//          If the character is already in the character table and within the current window,
//          update the start index to be one position after the last occurrence of the character.
            if (charIndex.containsKey(currentChar) && charIndex.get(currentChar) >= startIndex) {
                startIndex = charIndex.get(currentChar) + 1;
            }

//          Add uptated char to character table.
            charIndex.put(currentChar, endIndex);

//          Update maximum length
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }

        return maxLength;
    }
}
