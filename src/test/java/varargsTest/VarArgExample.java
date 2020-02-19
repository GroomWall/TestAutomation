package varargsTest;

public class VarArgExample {
    public int sumNumber(int ...args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for (int x:args) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarArgExample varArgExample = new VarArgExample();
        int sum2 = varArgExample.sumNumber(2,1);
        System.out.println("Sum of 2 numbers: " + sum2);

        int sum3 = varArgExample.sumNumber(2,1,29);
        System.out.println("Sum of 3 numbers: " + sum3);

        int sum4 = varArgExample.sumNumber(2,1,20,29);
        System.out.println("Sum of 4 numbers: " + sum4);
    }
}
