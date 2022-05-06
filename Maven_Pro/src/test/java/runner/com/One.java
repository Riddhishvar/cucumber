

package runner.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.Booking_page;
import com.pom.Confirm_page;
import com.pom.Home_page;
import com.pom.Logout_page;
import com.pom.Persondetails_page;
import com.sdp.Page_Object_Manager;

import base.com.Base_class;

public class One extends Base_class{
	public static WebDriver driver=Base_class.getBrowser("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	public static void main(String args[]) throws InterruptedException,IOException 
	{		
geturl("https://adactinhotelapp.com/");
sendinput(pom.getInstanceHp().getUsername(),"priyavenkataraman");
sendinput(pom.getInstanceHp().getPwd(),"Prajen@09");
click_on_webelement(pom.getInstanceHp().getLogin());
wait_imp();
select("visibletext",pom.getInstanceBp().getLoc(),"London");
select("visibleText",pom.getInstanceBp().getHotel(),"Hotel Sunshine");
select("visibletext",pom.getInstanceBp().getRoom(),"Deluxe");
select("visibletext",pom.getInstanceBp().getNos(),"1 - One");
sendinput(pom.getInstanceBp().getIn(),"3/30/2022");
sendinput(pom.getInstanceBp().getOut(),"4/2/2022");
select("visibletext", pom.getInstanceBp().getAdult(), "2 - Two");
select("index",pom.getInstanceBp().getChild() , "1");
click_on_webelement(pom.getInstanceBp().getSubmit());
wait_imp();
click_on_webelement(pom.getInstanceCp().getRadio());
click_on_webelement(pom.getInstanceCp().getCont());
sendinput(pom.getInstancePdp().getFname(),"priya");
sendinput(pom.getInstancePdp().getLname(),"venkat");
sendinput(pom.getInstancePdp().getAddr(),"34,tyti,chenai");
sendinput(pom.getInstancePdp().getCardno(),"2345678923456789");
select("visibletext", pom.getInstancePdp().getCardtype(), "VISA");
select("visibletext",pom.getInstancePdp().getExpmon(), "February");
select("visibletext", pom.getInstancePdp().getExpyear(), "2022");
sendinput(pom.getInstancePdp().getCvv(),"345");
click_on_webelement(pom.getInstancePdp().getBook());
wait_imp();
click_on_webelement(pom.getInstanceLp().getLogout());
screen_shot(("user.dir")+"\\logout.png");
//driver.get("http://automationpractice.com/index.php");
//WebElement women = driver.findElement(By.linkText("Women"));
//women.click();
//Thread.sleep(3000);
//WebElement dress = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[5]"));
//dress.click();
//WebElement cart = driver.findElement(By.id("add_to_cart"));
//cart.click();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//WebElement check = driver.findElement(By.cssSelector("a[title='Proceed to checkout']"));
//check.click();
//WebElement check1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//check1.click();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//WebElement create = driver.findElement(By.id("email_create"));
//create.sendKeys("prajen59@gmail.com");
//WebElement submit = driver.findElement(By.id("SubmitCreate"));
//submit.click();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//WebElement gen=driver.findElement(By.id("uniform-id_gender2"));
//gen.click();
//WebElement fname = driver.findElement(By.id("customer_firstname"));
//fname.sendKeys("priya");
//WebElement lname = driver.findElement(By.id("customer_lastname"));
//lname.sendKeys("venkat");
//WebElement pwd = driver.findElement(By.id("passwd"));
//pwd.sendKeys("Prajen1@09");
//WebElement day = driver.findElement(By.id("days"));
//Select s=new Select(day);
//s.selectByValue("24");
//WebElement mon = driver.findElement(By.id("months"));
//Select s1=new Select(mon);
//s1.selectByValue("2");
//WebElement year = driver.findElement(By.id("years"));
//Select s2=new Select(year);
//s2.selectByValue("1992");
//WebElement f_name = driver.findElement(By.name("firstname"));
//f_name.sendKeys("priya");
//WebElement l_name = driver.findElement(By.name("lastname"));
//l_name.sendKeys("venkat");
//WebElement addr = driver.findElement(By.id("address1"));
//addr.sendKeys("24,snjsdnjks,gjjs");
//WebElement city = driver.findElement(By.id("city"));
//city.sendKeys("chenai");
//WebElement stat = driver.findElement(By.id("id_state"));
//Select s3=new Select(stat);
//s3.selectByVisibleText("Alaska");
//WebElement post = driver.findElement(By.id("postcode"));
//post.sendKeys("00000");
//WebElement no = driver.findElement(By.id("phone_mobile"));
//no.sendKeys("856246");
//WebElement alis = driver.findElement(By.id("alias"));
//alis.sendKeys("24,snjsdnjks,gjjs");
//WebElement reg = driver.findElement(By.id("submitAccount"));
//reg.click();
//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//WebElement proceed = driver.findElement(By.name("processAddress"));
//proceed.click();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
////driver.switchTo().alert().dismiss();
//
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//WebElement tick = driver.findElement(By.id("cgv"));
//tick.click();
//
//WebElement carr = driver.findElement(By.name("processCarrier"));
//carr.click();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//WebElement pay = driver.findElement(By.className("bankwire"));
//pay.click();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//WebElement proceed1 = driver.findElement(By.cssSelector("[class='button btn btn-default button-medium']"));
//proceed1.click();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//TakesScreenshot ts=(TakesScreenshot)driver;
//File src=ts.getScreenshotAs(OutputType.FILE);
//File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\screenshot\\payment.png");
//FileUtils.copyFile(src, dest);
}
}