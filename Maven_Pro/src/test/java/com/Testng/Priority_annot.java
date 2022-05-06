package com.Testng;

import org.testng.annotations.Test;


public class Priority_annot {
	@Test
	private void women()
	{
	System.out.println("women");	
	}
@Test(priority=-1)
private void dresses()
{
System.out.println("dresses");	
}
@Test
private void tshirts()
{
System.out.println("tshirts");	
}
}
