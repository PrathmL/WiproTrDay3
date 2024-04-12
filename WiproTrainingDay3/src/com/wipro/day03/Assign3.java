package com.wipro.day03;
import java.util.Scanner;
public class Assign3 {
	public static void main(String[] args) {
		Scanner tin=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number =tin.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        System.out.println("The " + number + "th Fibonacci number is: " + fibonacci(number));
    }

    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Number cannot be negative");
        }
        
        long result = 1;
        for (int i = 1; i <=n; i++) {
            result *= i;
        }
        return result;
    }
    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < number; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
