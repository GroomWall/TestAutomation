package varargsTest;

public class NoVararg {
    public int sumNumbers(int a, int b) {
        return a + b;
    }

    public int sumNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        NoVararg noVararg = new NoVararg();
        System.out.println(noVararg.sumNumbers(1,2));
        System.out.println(noVararg.sumNumbers(1,2,3));
    }
}
