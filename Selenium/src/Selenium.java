

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\chrome1\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.get("https://www.flipkart.com/");
	wd.manage().window().maximize();
	                      //*WEB DRIVER METHODS*--- NAVIGATION METHODS//
	
	//wd.navigate().to("https://www.tnpsc.gov.in/");
	//wd.navigate().back();
	//wd.navigate().refresh();
	/*String title=wd.getTitle();
	System.out.println(title);
	String url=wd.getCurrentUrl();
	System.out.println(url);
	String pgsrc=wd.getPageSource();
	System.out.println(pgsrc);
	Dimension d=new Dimension(500,500);
	wd.manage().window().setSize(d);
	
	Point p=new Point(250,250);
	wd.manage().window().setPosition(p);*/
	
			//*WEB ELEMENT METHODS---LOGIN FACEBOOK//
			
	/*WebElement findElement = wd.findElement(By.id("email"));
	findElement.sendKeys("prajen@gmail.com");
	wd.findElement(By.name("pass")).sendKeys("priya@24");
	WebElement element=wd.findElement(By.name("login"));
	element.click();*/
	
				   //*CREATE NEW ACCOUNT--//
	
	/*WebElement create_acc = wd.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	create_acc.click();
	Thread.sleep(3000);
	wd.findElement(By.name("firstname")).sendKeys("prajen");
	wd.findElement(By.name("lastname")).sendKeys("sathish");
    wd.findElement(By.name("reg_email__")).sendKeys("23456");
    wd.findElement(By.id("password_step_input")).sendKeys("Priya@24");*/
  //  wd.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("prajen@gmail.com");
    
    			//*TAKESSCREENSHOT---//
    
    
   /* TakesScreenshot ts=(TakesScreenshot) wd;
    File source= ts.getScreenshotAs(OutputType.FILE);
    File destination=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\screenshot\\error.png");
    FileUtils.copyFile(source, destination);*/
    
    		//Drop down list//
    /*WebElement day = wd.findElement(By.id("day"));
    Select s=new Select(day);
    s.selectByValue("9");
    WebElement month = wd.findElement(By.name("birthday_month"));
    Select s1=new Select(month);
    s1.selectByIndex(1);
    WebElement year = wd.findElement(By.id("year"));
    Select s2=new Select(year);
    s2.selectByVisibleText("2015");
    wd.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
    wd.findElement(By.name("websubmit")).click();
    Thread.sleep(2000);
    TakesScreenshot ts1=(TakesScreenshot) wd;
    File src= ts1.getScreenshotAs(OutputType.FILE);
    File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\screenshot\\error1.png");
    FileUtils.copyFile(src, dest);*/
    
    					//---MULTIPLE DROPDOWN---//
//    
//    WebElement multiple = wd.findElement(By.xpath("(//select)[6]"));
//    Select s=new Select(multiple);
//    boolean b = s.isMultiple();
//    System.out.println(b);
//    s.selectByIndex(1);
//    s.selectByValue("2");
//    s.selectByVisibleText("UFT/QTP");
//    List<WebElement> options = s.getOptions();
//    System.out.println("Get all options  dropdown list");
//    for (WebElement webElement : options) {
//	System.out.println(webElement.getText());	
//    }
//	List<WebElement> options2 = s.getAllSelectedOptions();
//	System.out.println("Get selected options");
//	for (WebElement webElement2 : options2) {
//		System.out.println(webElement2.getText());
//	}
//	WebElement webElement3 = s.getFirstSelectedOption();
//	System.out.println("Get the first selected");
//	System.out.println(webElement3.getText());
//	
//	s.deselectByValue("2");
//	s.deselectByIndex(1);
//	s.deselectByVisibleText("UFT/QTP");
	
				//----Alert-----//
//	WebElement simple_alrt=wd.findElement(By.xpath("//button[@class='btn btn-danger']"));	
//	simple_alrt.click();
//	Thread.sleep(2000);
//	wd.switchTo().alert().accept();
//	
//	WebElement confirm_alrt = wd.findElement(By.xpath("//a[@href='#CancelTab']"));
//	confirm_alrt.click();
//	WebElement btn=wd.findElement(By.xpath("//button[@class='btn btn-primary']"));	
//	Thread.sleep(2000);
//	btn.click();
//	Thread.sleep(2000);
//	wd.switchTo().alert().dismiss();
	
//	--------------Frames-------------
//WebElement single_frame = wd.findElement(By.id("singleframe"));
//wd.switchTo().frame(single_frame);
//WebElement text= wd.findElement(By.xpath("//input[@type='text']"));
//text.sendKeys("Java");
//Thread.sleep(2000);
//wd.switchTo().defaultContent();
//WebElement btn = wd.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//btn.click();
//WebElement out_frame = wd.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//wd.switchTo().frame(out_frame);
//WebElement in_frame = wd.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
//wd.switchTo().frame(in_frame);
//WebElement text1 = wd.findElement(By.xpath("//input[@type='text']"));
//text1.sendKeys("Selenium");
//wd.switchTo().defaultContent();
	
//				------ACTIONS----
//	Actions a=new Actions(wd);
	
//	WebElement from_element = wd.findElement(By.id("draggable"));
//WebElement to_element = wd.findElement(By.id("droppable"));
// a.dragAndDrop(from_element, to_element).build().perform();
//	WebElement mobile = wd.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
//	a.contextClick(mobile).build().perform();
//	Thread.sleep(2000);
//	WebElement element = wd.findElement(By.id("draggable"));
//	WebElement to_element = wd.findElement(By.id("droppable"));
//	a.clickAndHold(element).moveToElement(to_element).release().perform();
	
	//		------Robots----------//
//	WebElement close = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//	close.click();
//	
//	Robot r=new Robot();
//	WebElement electronics = wd.findElement(By.linkText("Electronics"));
//	a.contextClick(electronics).build().perform();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//	WebElement groccer = wd.findElement(By.linkText("Grocery"));
//	a.contextClick(groccer).build().perform();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	WebElement travels= wd.findElement(By.linkText("Travel"));
//	a.contextClick(travels).build().perform();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	Set<String> wh = wd.getWindowHandles();
//	for (String string : wh) {
//		String string2 = wd.switchTo().window(string).getTitle();
//		System.out.println(string2);
//	}
//	String s="Electronics Big Savings Days Sale Store: Buy Online at Best Prices and Offers in India";
//	for (String string : wh) {
//		if(wd.switchTo().window(string).getTitle().equalsIgnoreCase(s))
//		break;
//	}
 
//			-------scroll javascriptexecutor-------------
//	WebElement close = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//	close.click();
	//JavascriptExecutor js=(JavascriptExecutor)wd;
	
//    WebElement mob = wd.findElement(By.linkText("Mobiles"));
//	js.executeScript("arguments[0].click()", mob);
//	WebElement intoview = wd.findElement(By.linkText("Wardrobes"));
//	js.executeScript("arguments[0].scrollIntoView()", intoview);
//	js.executeScript("window.scrollBy(0,2000)");
//	Thread.sleep(5000);
//	js.executeScript("window.scrollBy(0,-300)");
//	Thread.sleep(5000);
//	wd.get("https://www.facebook.com/");
//	JavascriptExecutor js=(JavascriptExecutor)wd;
//	WebElement mailid = wd.findElement(By.id("email"));
//	js.executeScript("arguments[0].value='prajen@gmail.com'",mailid);
//	WebElement pwd = wd.findElement(By.id("pass"));
//	js.executeScript("arguments[0].value='Prajen09'", pwd);""
//	WebElement login = wd.findElement(By.name("login"));
//	js.executeScript("arguments[0].click();", login);
	
	//			--------Wait----------
	//wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	wd.get("https://www.facebook.com/");
//	WebElement cre_acc = wd.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//	js.executeScript("arguments[0].click();",cre_acc);
//	WebDriverWait wait=new WebDriverWait(wd,30);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("james");

//Wait<WebDriver> wait=new FluentWait<>(wd).withTimeout(Duration.ofSeconds(30L))
//.pollingEvery(Duration.ofSeconds(5L)).ignoring(Exception.class);
//
//WebElement fname = wait.until(new Function<WebDriver,WebElement>()
//			{
//		public WebElement apply(WebDriver wd) {
//			return wd.findElement(By.name("firstname"));
//	}
//			}
//			) ;

//WebElement fname=wd.findElement(By.name("firstname"));
	//js.executeScript("arguments[0].value='prajen'",fname);
	//wd.close();
	
				//----Absolute xpath----
	
//	wd.get("https://www.javatpoint.com/java-mcq");
//	WebElement text = wd.findElement(By.xpath("/html/body/div[1]/div[1]/div[6]/div[2]/div[1]/table/tbody/tr/td/h1"));
//	String text2 = text.getText();
//	System.out.println(text2);
	 
				//-------Css selector------
	//wd.get("https://www.facebook.com/create/");
    //WebElement selector = wd.findElement(By.cssSelector("#email"));
	//selector.sendKeys("prajen");
//   String text = selector.getText();
//	System.out.println(text);
//	WebElement type = wd.findElement(By.cssSelector("._42ft._4jy0._cqr._4jy3._4jy2.selected._51sy.mrm"));
//	type.click();
//	wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	WebElement type2 = wd.findElement(By.cssSelector("[name='firstname']"));
//	type2.sendKeys("prajen");
//	WebElement type3 = wd.findElement(By.cssSelector("[name^='last']"));
//	type3.sendKeys("Riddhishvar");
//	WebElement type4 = wd.findElement(By.cssSelector("[aria-label$='email address']"));
//	type4.sendKeys("prajen@gmail.com");
//	WebElement mon = wd.findElement(By.id("month"));
//	Select s=new Select(mon);
//	s.selectByValue("9");
	
	//			-------Dynamic xpath------
//	wd.get("https://www.myntra.com/men-casual-shirts");
//	List<WebElement> list_shirt = wd.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
//	ArrayList<Integer> l =new ArrayList();
//	for (int i = 0; i < list_shirt.size(); i++) {
//	String str = list_shirt.get(i).getText().replaceAll("Rs. ", "");	
//	int price_list = Integer.parseInt(str);
//	l.add(price_list);
//	}
//	int arr_size=l.size();
//	System.out.println("total no of shirts= " +arr_size);
//	System.out.println("maximum price is " +Collections.max(l));
}
}
