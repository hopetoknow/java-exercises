package exercise;

import java.util.Stack;

public class App {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (Character ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                if ((ch == ')' && stack.pop() != '(') ||
                    (ch == '}' && stack.pop() != '{') ||
                    (ch == ']' && stack.pop() != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}