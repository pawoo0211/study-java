package study.algorithm.programmers.level1;

public class CloserChar {
    private int answer[];
    private String[] splitInput;

    public CloserChar(String input) {
        answer = new int[input.length()];
        answer[0] = -1;
        splitInput = input.split("");
    }

    public int[] find(String input) {
        for (int index = 1; index < input.length(); index++) {
            boolean isFound = hasCloserCharacter(index);
            if (!isFound) {
                answer[index] = -1;
            }
        }

        return answer;
    }

    private boolean hasCloserCharacter(int index) {
        String standardString = splitInput[index];
        int count = 0;
        for (int innerIndex = index - 1; 0 <= innerIndex; innerIndex--) {
            count++;
            if (standardString.equals(splitInput[innerIndex])) {
                answer[index] = count;
                return true;
            }
        }

        return false;
    }
}
