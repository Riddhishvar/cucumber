package com.Testng;

import org.testng.annotations.Test;

public class Grouping_test {
@Test(groups="stationary")
	private void books()
	{
		System.out.println("books");
	}
@Test(groups="stationary")
private void pens()
{
	System.out.println("pens");
}
@Test(groups="stationary")
private void pencils()
{
	System.out.println("pencils");
}
@Test(groups="music")
private void wynk()
{
	System.out.println("wynk");
}
@Test(groups="music")
private void spotify()
{
	System.out.println("spotify");
}

}
