package practic.exceptions.task1;

import practic.exceptions.task1.Factorial;
import practic.exceptions.task1.FactorialException;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        try {
            System.out.println(factorial.getFactorial(6));
        } catch (FactorialException e) {
            System.err.println(e.getMessage());
        }
    }
}