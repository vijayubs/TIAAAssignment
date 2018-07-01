package com.tiaa.vijay;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.*;
import static org.hamcrest.Matchers.greaterThan;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.CoreMatchers.allOf;

import junit.framework.TestCase;

public class WorkerTest {

	
	// Machine =3 and Bolts  = 6 , then product will be 3 
	@Test
	public void TotalProduct() {
		int X  = 3;
		int Y= 6 ;
		Worker worker = new Worker(X,Y);
		worker.statWork();		
		assertEquals(3, worker.getTotalProduct());
	}
	
	
	// Machine =3 and Bolts  = 12 , then product will be 3
	@Test
	public void TotalProduct1() {
		int X  = 3;
		int Y= 12 ;
		Worker worker = new Worker(X,Y);
		worker.statWork();		
		assertEquals(3, worker.getTotalProduct());
	}
	
	// Machine =12 and Bolts  = 2 , then product will be 1
		@Test
		public void TotalProduct3() {
			int X  = 12;
			int Y= 2 ;
			Worker worker = new Worker(X,Y);
			worker.statWork();		
			assertEquals(1, worker.getTotalProduct());
		}
	

	// Total Time Take for 3 products 
	
		// coulnt complete due to time contraints 

	
}
