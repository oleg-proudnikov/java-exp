package dev.intx.interview;

public class FizzBuzz {

    public String evaluate(int n) {
        return n % 15 == 0 ? "FizzBuzz" : (n % 3 == 0 ? "Fizz" : (n % 5 == 0 ? "Buzz" : "" + n));
    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzz().evaluate(1));
        System.out.println(new FizzBuzz().evaluate(3));
        System.out.println(new FizzBuzz().evaluate(5));
        System.out.println(new FizzBuzz().evaluate(15));
    }

}
