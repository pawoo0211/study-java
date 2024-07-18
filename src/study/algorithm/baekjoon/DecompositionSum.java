package study.algorithm.baekjoon;

class DecompositionSum {

    public String calculate(String input) {
        int intInput = Integer.parseInt(input);
        int inputLength = input.length();
        int candidate = intInput - inputLength;
        int result = 0;

        for (int count = intInput - inputLength; 0 < count; count--) {
            char[] resultCharArray = String.valueOf(candidate).toCharArray();
            int sum = candidate + sumArray(resultCharArray);

            if (intInput == sum) {
                result = candidate;
            }

            candidate--;
        }

        return String.valueOf(result);
    }

    private int sumArray(char[] resultCharArray) {
        int sum = 0;
        for (int index = 0; index < resultCharArray.length; index++) {
            sum = sum + Character.getNumericValue(resultCharArray[index]);
        }

        return sum;
    }
}