package varargsImplementationExample;

public class VerifyVarargsOverloading {
    public static void main(String[] args) {
        VerifyVarargsOverloading obj = new VerifyVarargsOverloading();
        obj.varargsOverloadingTest(1, 2, 3);
        obj.varargsOverloadingTest(true, "hello", "world");
    }

    private void varargsOverloadingTest(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    private void varargsOverloadingTest(boolean p, String... args) {
        boolean negate = !p;
        System.out.println("negate = " + negate);
        System.out.println("args.length = " + args.length);
    }
}
