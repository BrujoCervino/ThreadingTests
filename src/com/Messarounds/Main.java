package com.Messarounds;

// A standard thread.
class MyThread extends Thread {
    @Override
    public void run() {
        PrintFizzBuzzSynchronised();
    }

    private void PrintFizzBuzzSynchronised() {
        Main.FizzBuzzThreaded();
    }
}

// A thread using the synchronised keyword.
class MySynchronisedThread extends Thread {
    @Override
    public void run() {
        PrintFizzBuzzSynchronised();
    }

    private synchronized void PrintFizzBuzzSynchronised() {
        Main.FizzBuzzThreadedSynced();
    }
}

// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
// For numbers which are multiples of both three and five print "FizzBuzz".

public class Main {

    static int MethodCallCounter = 0;
    static int MethodCallCounterSynced = 0;

    static final int TIMES_SHOULD_RUN = 5;

    public static void main(String[] args) {
        // write your code here

        System.out.println("FizzBuzz:\n\n");
        System.out.println("FizzBuzz without threading:\n\n");
        for (int i = 0; i < TIMES_SHOULD_RUN; i++) {
            FizzBuzzOriginal();
        }

        FizzBuzz();
        System.out.println("FizzBuzz with threading:\n\n");
        for (int i = 0; i < TIMES_SHOULD_RUN; i++) {
            MyThread myThread = new MyThread();
            myThread.run();
        }

        System.out.println("FizzBuzz with synchronised threading:\n\n");
        for (int i = 0; i < TIMES_SHOULD_RUN; i++) {
            MySynchronisedThread mySynchronisedThread = new MySynchronisedThread();
            mySynchronisedThread.run();
        }
    }

    // Version 3: added defensive equals (constant first negates the risk of accidental assignment)
    public static void FizzBuzz() {
        public static void FizzBuzzOriginal() {

            String printVal = "";
            // Count from 1 to 100
            public class Main {
            }
        }

        public static void FizzBuzzThreaded() {

            ++MethodCallCounter;
            final String myString = "Hi from FizzBuzzThreaded, call #" + MethodCallCounter + "! ";
            String printVal = myString;
            // Count from 1 to 100
            for (int i = 1; i <= 100; ++i) {
                if (0 == i % 3) {
                    printVal += "Fizz";
                }
                if (0 == i % 5) {
                    printVal += "Buzz";
                }
                else if(printVal.equals(myString)) {
                    printVal += Integer.toString(i);
                }
                System.out.println(printVal);
                printVal = myString;
            }
        }

        public static void FizzBuzzThreadedSynced() {
            ++MethodCallCounterSynced;
            final String myString = "Hi from FizzBuzzThreadedSynced, call #" + MethodCallCounterSynced + "! ";
            String printVal = myString;
            // Count from 1 to 100
            for (int i = 1; i <= 100; ++i) {
                if (0 == i % 3) {
                    printVal += "Fizz";
                }
                if (0 == i % 5) {
                    printVal += "Buzz";
                } else if (printVal.equals(myString)) {
                    printVal += Integer.toString(i);
                }
                System.out.println(printVal);
                printVal = myString;
            }
        }
    }
