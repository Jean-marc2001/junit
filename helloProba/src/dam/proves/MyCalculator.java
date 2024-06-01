package dam.proves;

public class MyCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisió per zero");
        }
        return a / b;
    }

}