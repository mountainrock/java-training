package com.bri8.threads;

/**
 * In this program, we create a NumberPrinterThread class that extends the Thread class. 
 * This custom thread class overrides the run() method, where we put the code that will be executed by the thread. 
 * The thread prints numbers from 1 to 10 along with its thread name and pauses for a short time (500 milliseconds) between each number using 
 * Thread.sleep().

In the main() method, we create two threads using the NumberPrinterThread class and start them using the start() method. 
When the program runs, the two threads will print numbers simultaneously, demonstrating the concept of multithreading.

 */
public class SimpleMultithreadedProgram {

    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new NumberPrinterThread("Thread 1");
        Thread thread2 = new NumberPrinterThread("Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();
    }


}


// Custom Thread class to print numbers
 class NumberPrinterThread extends Thread {
    private final String threadName;

    public NumberPrinterThread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + ": " + i);

            try {
                // Pause the thread for a short time
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

