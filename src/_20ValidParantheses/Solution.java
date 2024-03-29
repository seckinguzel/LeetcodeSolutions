package _20ValidParantheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; //If we don't use this, a specific test case won't run whis is "([}}])".
            }
        }

        return stack.isEmpty();
    }
}
