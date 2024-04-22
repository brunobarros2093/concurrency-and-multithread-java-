package org.example;

public class Main {
    public static void main(String[] args) {
       Thread thread = new NewThread();
       thread.start();
    }
    // concrete thread
    private static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("hello from " + Thread.currentThread().getName());
        }
    }
}