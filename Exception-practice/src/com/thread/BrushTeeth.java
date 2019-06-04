package com.thread;

public class BrushTeeth implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Brushing teeth");
            Thread.sleep(3000);
            System.out.println("Bruthed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
