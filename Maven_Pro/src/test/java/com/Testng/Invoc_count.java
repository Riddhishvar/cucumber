package com.Testng;

import org.testng.annotations.Test;

public class Invoc_count {
	@Test(priority=-1)
	private void women()
	{
	System.out.println("women");	
	}
@Test
private void dresses()
{
System.out.println("dresses");	
}
@Test
private void tshirts()
{
System.out.println("tshirts");	
}
@Test(invocationCount=3)
private void refresh()
{
	System.out.println("refresh");
}
}
