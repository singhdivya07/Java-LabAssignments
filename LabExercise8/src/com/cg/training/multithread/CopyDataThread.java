package com.cg.training.multithread;

import java.io.*;

import java.io.BufferedReader;

public class CopyDataThread extends Thread {
	
public CopyDataThread() {
		
	}
	
	public CopyDataThread(String threadName) {
		super(threadName);
	}
	public void run()
	{
		System.out.println(Thread.currentThread()); 
    
    		try {
    			FileReader fileread = new FileReader("F:\\Java capg\\LabExercise8\\src\\com\\cg\\training\\multithread\\source.txt");
    			BufferedReader bufferread = new BufferedReader(fileread );
    			FileWriter filewrite = new FileWriter("F:\\Java capg\\LabExercise8\\src\\com\\cg\\training\\multithread\\target.txt", true);
    			int s;
     
    			while ((s = bufferread.read()) != -1) { 
    			
                    if(s%10==0)
                	{
                		System.out.println("10 characters copied");
                		try {
							Thread.sleep(100*50);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
                	}
                    filewrite.write(s); 
    			
    			}
    			bufferread.close();
    			filewrite.close();
                          
    		} catch (IOException e) {
    			
    			e.printStackTrace();
    		}
  
}
}