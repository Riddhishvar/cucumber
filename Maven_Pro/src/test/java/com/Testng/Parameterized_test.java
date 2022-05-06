package com.Testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_test {
	@Test
	@Parameters({"username","pwd"})
	private void credentials(@Optional("priya")String username,@Optional("priya123")String pwd)
	{
		System.out.println("username is " +username);
		System.out.println("Password is " +pwd);
	}

}
