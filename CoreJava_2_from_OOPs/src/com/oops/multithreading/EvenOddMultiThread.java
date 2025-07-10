package com.multithreading;

class EvenPrinter extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOddMultiThread {
    public static void main(String[] args) {
        new EvenPrinter().start();
        new OddPrinter().start();
    }
}
