package com.thread;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Breakfast breakfast = new Breakfast();
        breakfast.start();

        BrushTeeth brushteeth = new BrushTeeth();
        Thread thread = new Thread(brushteeth);
        thread.start();

        try {
            breakfast.join();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Eat Breakfast");
    }
}

