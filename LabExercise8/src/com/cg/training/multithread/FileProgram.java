package com.cg.training.multithread;



public class FileProgram {

		public static void main(String[] args) {
			System.out.println(Thread.currentThread()); 
			Thread t1= new CopyDataThread("worker-1");
			t1.start();
			
			

		}

	
	
}
