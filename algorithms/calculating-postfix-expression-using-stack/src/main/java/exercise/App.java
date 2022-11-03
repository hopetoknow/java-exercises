package exercise;

import java.util.Stack;

public class App {

    public static int calculatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int number1 = stack.pop();
                int number2 = stack.pop();

                switch (ch) {
                    case '+' -> stack.push(number2 + number1);
                    case '-' -> stack.push(number2 - number1);
                    case '*' -> stack.push(number2 * number1);
                    case '/' -> stack.push(number2 / number1);
                }
            }
        }
        return stack.pop();
    }

    public static int calculatePostfix2(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {
                int number = 0;

                while (Character.isDigit(ch)) {
                    number = number * 10 + (ch - '0');
                    i++;
                    ch = expression.charAt(i);
                }

                i--;
                stack.push(number);

            } else {
                int number1 = stack.pop();
                int number2 = stack.pop();

                switch (ch) {
                    case '+' -> stack.push(number2 + number1);
                    case '-' -> stack.push(number2 - number1);
                    case '*' -> stack.push(number2 * number1);
                    case '/' -> stack.push(number2 / number1);
                }
            }
        }
        return stack.pop();
    }
}