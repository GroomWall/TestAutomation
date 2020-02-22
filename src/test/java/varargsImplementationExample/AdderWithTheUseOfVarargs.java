package varargsImplementationExample;

public class AdderWithTheUseOfVarargs {
    public static void main(String[] args) {
        AdderWithTheUseOfVarargs varargsStorage = new AdderWithTheUseOfVarargs();
        int sumOfTwoNumbers = varargsStorage.sumNumbersWithTheUseOfVarargs(2, 1);
        System.out.println("Sum of 2 numbers: " + sumOfTwoNumbers);

        int sumOfThreeNumbers = varargsStorage.sumNumbersWithTheUseOfVarargs(2, 1, 29);
        System.out.println("Sum of 3 numbers: " + sumOfThreeNumbers);

        int sumOfFourNumbers= varargsStorage.sumNumbersWithTheUseOfVarargs(2, 1, 20, 29);
        System.out.println("Sum of 4 numbers: " + sumOfFourNumbers);
    }

    public int sumNumbersWithTheUseOfVarargs(int... args) {
        System.out.println("arguments length: " + args.length);
        int sum = 0;
        for (int x : args) {
            sum += x;
        }
        return sum;
    }
}
