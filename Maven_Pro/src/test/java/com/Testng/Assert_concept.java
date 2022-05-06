package com.Testng;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_concept {
	@Test
	private void demo()
	{
//		String expect_username="Prajen";
//		String actual_username="Prajen";
		assertFalse(10==9);
		//Assert.assertEquals(actual_username,expect_username);
		System.out.println("validation");
	}
//@Test
//private void demo1()
//{
//	String expect_username="Prajen";
//	String actual_username="Riddhishvar"; 
//	SoftAssert soft=new SoftAssert();
//	soft.assertEquals(actual_username, expect_username);
//	System.out.println("verification");
//	soft.assertAll();
//}
}
