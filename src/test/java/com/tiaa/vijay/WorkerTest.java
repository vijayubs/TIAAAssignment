package com.tiaa.vijay;

import static org.junit.Assert.*;

import org.junit.*;


public class WorkerTest {
	
	// Machine =3 and Bolts  = 6 , then product will be 3 ,
	@Test
	public void TotalProduct() {
		int X  = 3;
		int Y= 6 ;
		int sleepInSeconds = 60;
		Worker worker = new Worker(X,Y,sleepInSeconds);
		worker.statWork();		
		assertEquals(3, worker.getTotalProduct());
	}
	
	// Machine =3 and Bolts  = 12 , then product will be 3
	@Test
	public void TotalProduct1() {
		int X  = 3;
		int Y= 12 ;
		int sleepInSeconds = 60;
		Worker worker = new Worker(X,Y,sleepInSeconds);
		worker.statWork();		
		assertEquals(3, "TimeTaken="+worker.getTotalProduct());
	}
	
	// Machine =12 and Bolts  = 2 , then product will be 1
		@Test
		public void TotalProduct3() {
			int X  = 12;
			int Y= 2 ;
			int sleepInSeconds = 60;
			Worker worker = new Worker(X,Y,sleepInSeconds);
			worker.statWork();		
			assertEquals(1, worker.getTotalProduct());
		}
	
		// Machine =0 and Bolts  = 0 , then product will be 0
				@Test
				public void TotalProduct4() {
					int X  = 0;
					int Y= 0 ;
					int sleepInSeconds = 60;
					Worker worker = new Worker(X,Y,sleepInSeconds);
					worker.statWork();		
					assertEquals(0, worker.getTotalProduct());
				}


		// Total Time Take for preparing 3 products 
	
		// coulnt complete due to time contraints 

	
}
