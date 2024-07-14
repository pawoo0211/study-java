package study.algorithm.programmers.level1;

import java.util.Stack;

public class HateSameNumber {

    public int[] removeDuplicatesOnRight(int[] arr) {
        Stack<Integer> stack = new Stack();
        for (int arrNumber : arr) {
            if (stack.empty() || (arrNumber != stack.peek())) {
                stack.push(arrNumber);
            }
        }

        int[] answer = new int[stack.size()];
        for (int index = stack.size() - 1; 0 <= index; index--) {
            answer[index] = stack.pop();
        }

        return answer;
        }
}