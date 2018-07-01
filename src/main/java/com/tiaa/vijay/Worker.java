package com.tiaa.vijay;

import java.util.concurrent.atomic.AtomicInteger;

public class Worker extends Thread{

	int X;
	int Y ;
	int sleepInSeconds;
	private AtomicInteger totalProduct = new AtomicInteger();
	long totalTimeTaken =0;
	Object unfinishedgoodsLock = new Object();
	
	public Worker(int X, int Y, int sleepInSeconds) {
		this.X = X ;
		this.Y = Y;
		this.sleepInSeconds = sleepInSeconds;
	}


	public boolean getUnfinishedGood() 
	{
		boolean IsRawMaterialavailable = false; 
		synchronized (unfinishedgoodsLock) 
		{			
				if(X ==0 || Y == 0 ){     // Checking if enough raw material is available or not 
					IsRawMaterialavailable =  false;      ///False means raw material has been finished
														  //True means raw material is remaining
				}
				else {
					for(int i=1;i<=X;i++){
						if(i*2 <= Y){
							X--;
							Y-=2;
							IsRawMaterialavailable = true;							
							break;
						}
					}
				}			
		}
		return IsRawMaterialavailable;
	}
	
	
	
	public void assembleProduct() {
		
		boolean IsRawMaterialavailable = getUnfinishedGood();		
		
			if(IsRawMaterialavailable){
				do {		
					try {								
						Thread.sleep(sleepInSeconds*1000); 
						totalProduct.incrementAndGet();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}while(getUnfinishedGood());
			}
	}
	

	
	
	public void statWork()
	{
		System.out.println("3 workers Starting work ....");
		

		
		// Creating 3 Worker Thread .       
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				assembleProduct();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				assembleProduct();
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			
			public void run() {
				assembleProduct();
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		long start = System.currentTimeMillis();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		
		
		totalTimeTaken = end-start;
		System.out.println("Total Time Taken  ms "+ totalTimeTaken+ " , Total Products ="+totalProduct);
			
	}
	
	
	public int getTotalProduct(){
		return totalProduct.get();
	} 
	
	public long getTotalTimeTaken(){
		return totalTimeTaken;
	}
}
