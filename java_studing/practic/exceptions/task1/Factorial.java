package practic.exceptions.task1;

public class Factorial {
    public int getFactorial(int num) throws FactorialException {
        int res = 1;
        if (num <= 0) {
            throw new FactorialException("The number must be 1 or more");
        } else {
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
            return res;
        }
    }
}
