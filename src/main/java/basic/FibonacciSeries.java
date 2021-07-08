package basic;

import java.util.stream.IntStream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int range = 100;
        //printFibonacciSeriesV1(range);
        printFibonacciSeriesV2(100);
        //printFibonacciSeriesV3();

        // fibonacci of n th number
        //System.out.println(fibbonacci(50));
    }


    private static void printFibonacciSeriesV2(int range) {
        int fib1 = 1;
        int fib2 = 1;

        System.out.print(fib1 +", "+fib2+", ");

        for (int i = 1; i < range; i++) {
            int next = fib1 + fib2;
            System.out.print(next+", ");
            fib1 = fib2;
            fib2 = next;
        }

    }

    private static void printFibonacciSeriesV1(int range) {

        int sum[] = new int[range];
        sum[0] = 0;
        sum[1] = 1;

        for ( int i = 2; i < range; i++) {
            sum[i] = sum[i-2] + sum[i-1];
            System.out.print(sum[i]+", ");
        }
    }

   private static void printFibonacciSeriesV3(){
        IntStream.range(1,100).map(num -> fibbonacci(num)).forEach(System.out::println);
   }

    private static int fibbonacci(int num) {
        if (num < 3)
            return 1;
        else
            return fibbonacci(num-2) + fibbonacci(num-1);
    }

}
