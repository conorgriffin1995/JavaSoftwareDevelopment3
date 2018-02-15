package sdev3lab22;

import java.util.Scanner;

public class TestPrime {

    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        Scanner in = new Scanner(System.in);
        int numberOfThreads = 0;
        while (numberOfThreads < 1 || numberOfThreads > 5) {
            System.out.println("How many threads do you want to use (from 1 to 5)? ");
            numberOfThreads = in.nextInt();
            if (numberOfThreads < 1 || numberOfThreads > 5) {
                System.out.println("Please enter 1, 2, 3, 4 or 5 !");
            }
        }

        System.out.print("\nEnter the starting range: ");
        start = in.nextInt();
        String s = in.nextLine();
        System.out.print("\nEnter the ending range: ");
        end = in.nextInt();

        int rangePart = (end - start) / numberOfThreads;
        System.out.println("\nCounting primes between " + (start + 1) + " and "
                + (end) + " using " + numberOfThreads + " threads...\n");
        long startTime = System.currentTimeMillis();

        Thread[] worker = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            CountPrimesThread cpt = new CountPrimesThread(start + i
                    * rangePart + 1, start + (i + 1) * rangePart);
            worker[i] = new Thread(cpt);
        }

        for (int i = 0; i < numberOfThreads; i++) {
            worker[i].start();
        }

        for (int i = 0; i < numberOfThreads; i++) {
            while (worker[i].isAlive()) {
                try {
                    worker[i].join();
                } catch (InterruptedException e) {

                }
            }
        }

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("\nTotal elapsed time:    " + (elapsedTime / 1000.0)
                + " seconds.\n");

    }

}
