package com.Testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_annot {
	@Ignore
		@Test
		private void women()
		{
		System.out.println("women");	
		}
	@Test(enabled=false)
	private void dresses()
	{
	System.out.println("dresses");	
	}
	@Test
	private void tshirts()
	{
	System.out.println("tshirts");	
	}
	@Test
	private void men()
	{
		System.out.println("men");
	}
	
	}


