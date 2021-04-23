package dev.intx.interview;

public class FizzBuzz {

    public static String evaluate(int n) {
        return n % 15 == 0 ? "FizzBuzz" : (n % 3 == 0 ? "Fizz" : (n % 5 == 0 ? "Buzz" : "" + n));
    }

    public static void main(String[] args) {
        for (int i : new int[]{1, 3, 5, 15}) {
            System.out.println(evaluate(i));
        }
    }

}
