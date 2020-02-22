package varargsImplementationExample;

public class AdderWithoutVarargs {
    public static void main(String[] args) {
        AdderWithoutVarargs adderWithNoVarargs = new AdderWithoutVarargs();
        System.out.println(adderWithNoVarargs.sumOfTwoNumbers(1, 2));
        System.out.println(adderWithNoVarargs.sumOfThreeNumbers(1, 2, 3));
    }

    public int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public int sumOfThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }
}
