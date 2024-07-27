package generalCoding;

import java.util.Stack;

public class checkStringIsBalancedCharacters {

    public boolean checkStringIsBalancedOrNot(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false; // If we encounter any other character or mismatch, return false
            }
        }

        return stack.isEmpty(); // Stack should be empty if all opening symbols are matched correctly
    }
}

