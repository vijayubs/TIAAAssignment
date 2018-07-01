package com.tiaa.vijay;

import java.util.Scanner;

public class TIAAMain 
{	
	public static void main(String args[])
	{
	
		// Take the input for raw material  (machine and Bolts )
		
		System.out.println("Please enter raw Bolts and Machiene ");
		
		Scanner scan = new Scanner(System.in);
		
		int X  = Integer.parseInt(scan.next());
		
		int Y = Integer.parseInt(scan.next());
	
		System.out.println("total Machiene ="+X+" And Total Bolts  = "+Y );
		
		// Send workers to conveyor  to pick the raw material 
		new Worker(X,Y).statWork();
		
		
	}
	
}
