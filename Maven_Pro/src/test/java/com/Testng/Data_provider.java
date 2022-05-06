package com.Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	@Test(dataProvider = "data")
	
private void credentials(String username,String pwd)
{
	System.out.println("username is "+username);
	System.out.println("password is "+pwd);
}
	@DataProvider
	private Object[][] data()
	{
		return new Object [][] {
			{"prajen","prajen123"},
			{"priya","priya123"},
			{"sathish","sathish@123"}
		
	};
	}
}
