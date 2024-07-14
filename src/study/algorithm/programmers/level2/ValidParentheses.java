package study.algorithm.programmers.level2;

import java.util.Stack;

public class ValidParentheses {
    private static final char LEFT_PARENTHESES = '(';
    private static final char RIGHT_PARENTHESES = ')';

    public boolean isValid(String s) {
        Stack stack = new Stack<>();

        for (char thisParentheses : s.toCharArray()) {
            boolean isStackEmpty = stack.empty();

            if (isStackEmpty && thisParentheses == LEFT_PARENTHESES) {
                return false;
            }

            if (isStackEmpty || thisParentheses == RIGHT_PARENTHESES) {
                stack.push(thisParentheses);
            } else {
                stack.pop();
            }
        }

        return stack.size() == 0;
    }
}