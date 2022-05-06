package runner.com;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pom1.Addr_page;
import com.pom1.Confirm_order;
import com.pom1.Home_page1;
import com.pom1.Pay_page;
import com.pom1.Proceed_page;
import com.pom1.Select_page;
import com.pom1.Shipping_page;
import com.pom1.Signup_page;
import com.sdp1.Page_Object_Manager1;

//import com.pom1.Home_page1;
//import com.pom1.Login_page;

import base.com.Base_class;

public class Runner_class extends Base_class {
		
	public static WebDriver driver=Base_class.getBrowser("chrome");
	public static Page_Object_Manager1 pom1=new Page_Object_Manager1(driver);
	//public static void main(String args[]) throws InterruptedException,IOException 
	//{	
	@Test
		
	private void runner_test() throws IOException, InterruptedException
		{
		geturl("http://automationpractice.com/index.php");
		click_on_webelement(pom1.getInstanceHop().getSignup());
		wait_imp();
		String name = read_particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Maven_Pro\\Excel\\User_Name.xlsx", 1, 4);
		wait_imp();
		sendinput(pom1.getInstanceSp().getMailid(),name);
		wait_imp();
		String pwd = read_particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Maven_Pro\\Excel\\User_Name.xlsx", 2, 4);
		wait_imp();
		sendinput(pom1.getInstanceSp().getPwd(),pwd);
		click_on_webelement(pom1.getInstanceSp().getSubmit());
		click_on_webelement(pom1.getInstanceSel().getDress());
	Thread.sleep(3000);
	click_on_webelement(pom1.getInstanceSel().getImg());
	Thread.sleep(3000);
	click_on_webelement(pom1.getInstanceSel().getCart());
	wait_imp();
	click_on_webelement(pom1.getInstanceSel().getCheck());
	click_on_webelement(pom1.getInstancePp().getProceed());
	wait_imp();
	click_on_webelement(pom1.getInstanceAd().getAddr());
	wait_imp();
	click_on_webelement(pom1.getInstanceShip().getShip());
	click_on_webelement(pom1.getInstanceShip().getCarrier());
	wait_imp();
	click_on_webelement(pom1.getInstancePay().getPay());
	wait_imp();
	click_on_webelement(pom1.getInstanceCo().getCon_button());
	wait_imp();
	screen_shot(("user.dir")+"\\error2.png");
	}
	}

