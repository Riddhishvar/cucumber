package com.Testng;

import org.testng.annotations.Test;


public class Timeout_test {
@Test(timeOut=6000)
private void logout() throws InterruptedException
{
	System.out.println("setproperty");
	Thread.sleep(2000);
	System.out.println("lauchbrowser");
	System.out.println("geturl");
	Thread.sleep(2000);
	System.out.println("getdress");
	Thread.sleep(1000);
	System.out.println("logout");
}
}
