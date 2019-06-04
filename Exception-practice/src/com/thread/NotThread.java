package com.thread;

public class NotThread {
	 public static void main(String[] args) {
		 try {
	            System.out.println("Making Breakfast");
	            Thread.sleep(4000);
	            System.out.println("Breakfast done");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 
		 try {
	            System.out.println("Brushing teeth");
	            Thread.sleep(3000);
	            System.out.println("Bruthed");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 
	    }
	}

	


