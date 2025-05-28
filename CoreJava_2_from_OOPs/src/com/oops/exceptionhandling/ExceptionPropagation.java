package com.exceptionhandling;

public class ExceptionPropagation {

	static void method1() {
        int result = 10 / 0;  // ArithmeticException
    }

    static void method2() {
        method1();  // No try-catch here
    }

    static void method3() {
        try {
            method2();  // Exception is caught here
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in method3: " + e);
        }
    }

    public static void main(String[] args) {
        method3();  // Start of call stack
    }

}
