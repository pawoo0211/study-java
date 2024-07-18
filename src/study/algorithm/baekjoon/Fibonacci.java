package study.algorithm.baekjoon;

public class Fibonacci {
    private static int fibCount = 0;
    private static int fibonacciCount = 0;

    public String compare(String input) {
        int intInput = Integer.parseInt(input);
        fib(intInput);
        dynamic(intInput);

        return String.valueOf(fibCount) + " " + String.valueOf(fibonacciCount);
    }

    private int fib(int input) {
        if (input == 1 || input == 2) {
            fibCount++;
            return 1;
        } else {
            return (fib(input -1) + fib(input - 2));
        }
    }

    private int dynamic(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int[] f = new int[n];
        f[1] = 1;
        f[2] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciCount++;
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n - 1];
    }
}