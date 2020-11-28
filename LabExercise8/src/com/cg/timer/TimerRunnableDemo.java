package com.cg.timer;

import java.time.LocalDateTime;


import com.cg.timer.TimerRunnable;

public class TimerRunnableDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
        
        Runnable runnable= new TimerRunnable();
        
        Thread t1= new Thread(runnable,"worker-1");
        //main thread spawns thread, worker-1 which executes run() method
        //start() method invokes run() method
        t1.start();
           
	
	}
}

