package _13RomanToInteger;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && (s.substring(i, i + 2).equals("IV")
                    || s.substring(i, i + 2).equals("IX")
                    || s.substring(i, i + 2).equals("XL")
                    || s.substring(i, i + 2).equals("XC")
                    || s.substring(i, i + 2).equals("CD")
                    || s.substring(i, i + 2).equals("CM"))) {
                if (s.substring(i, i + 2).equals("IV"))
                    result += 4;
                else if (s.substring(i, i + 2).equals("IX"))
                    result += 9;
                else if (s.substring(i, i + 2).equals("XL"))
                    result += 40;
                else if (s.substring(i, i + 2).equals("XC"))
                    result += 90;
                else if (s.substring(i, i + 2).equals("CD"))
                    result += 400;
                else
                    result += 900;
                i++;
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }
}
