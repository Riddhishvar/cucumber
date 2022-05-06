package runner.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.com.Base_class;

public class Two extends Base_class{
	public static WebDriver driver=Base_class.getBrowser("chrome");
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
//	geturl("https://www.flipkart.com/");
//	navigate_to("https://www.tnpsc.gov.in/");
//	nav_back();
	//String title=driver.getTitle();
	//System.out.println(get_title());
	//String url=driver.getCurrentUrl();
	//System.out.println(get_cur_url());
	//String pgsrc=driver.getPageSource();
	//System.out.println(get_pagesrc());
	//WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	//close.click();
	
	//geturl("http://demo.automationtesting.in/Frames.html"); 
	
//             -----------alert------------
	
//	WebElement simple_alrt=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));	
//	simple_alert(simple_alrt);
//WebElement confirm_alrt = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
//	WebElement btn=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));	
//	confirm_alert(confirm_alrt,btn,"ok");
//	WebElement Prompt_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
//	WebElement btn1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
//	prompt_alert(Prompt_alert,btn1,"Prajen");
	
	         //	--------------Frames ,getattribute-------------
geturl("http://demo.automationtesting.in/Frames.html"); 	
//WebElement single_frame = driver.findElement(By.id("singleframe"));
//frames(single_frame);
//WebElement text= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//sendinput(text,"java");
//wait_imp();
//driver.switchTo().defaultContent();
	WebElement btn = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
btn.click();
WebElement out_frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
frames(out_frame);
WebElement in_frame =driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
frames(in_frame);
WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));

System.out.println(is_display(text1));
sendinput(text1,"Selenium");	
//System.out.println(get_attr(text1));
	
//driver.switchTo().defaultContent();
	
	
//	--------------------DropDown-----------------
	
//	geturl("http://www.leafground.com/pages/Dropdown.html");
//	WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
//	  System.out.println(is_multiple(multiple));
//  get_options(multiple);
//  select("visibletext",multiple, "UFT/QTP");
//  get_sel_opt(multiple);
//  get_first_sel_opts(multiple);
	
//---------------------Actions (methods) screenshot----------------	
//    geturl("http://www.leafground.com/pages/drop.html");
//	WebElement from_element = driver.findElement(By.id("draggable"));
//    WebElement to_element = driver.findElement(By.id("droppable"));
//    droppable(from_element,to_element);
//	screen_shot(("user.dir")+"\\error1.png");
//	geturl("https://www.amazon.in/");
//	WebElement mobile = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
	//context_click(mobile);
	//double_click(mobile);
//	WebElement element = driver.findElement(By.id("draggable"));
//	WebElement to_element =driver.findElement(By.id("droppable"));
//	clickandhold(element,to_element);
	
                        //	------Robots (window handles)----------//
//	geturl("https://www.flipkart.com/");
//WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//click_on_webelement(close);
//WebElement electronics = driver.findElement(By.linkText("Electronics"));
//robot(electronics);
	
	
//WebElement groccer = driver.findElement(By.linkText("Grocery"));
//robot(groccer);
//get_win_handles();
//System.out.println(get_window_handle());

//-------------------Scroll upanddown-------------
//geturl("https://www.flipkart.com/");
//WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//click_on_webelement(close);
//scr_upanddown("window.scrollBy(0,2000)");
//wait_imp();
//scr_upanddown("window.scrollBy(0,-2000)");
//JavascriptExecutor js=(JavascriptExecutor)driver;
//WebElement mob =driver.findElement(By.linkText("Mobiles"));
//js.executeScript("arguments[0].click()", mob);
//WebElement intoview = driver.findElement(By.linkText("Wardrobes"));
//js.executeScript("arguments[0].scrollIntoView()", intoview);
//js.executeScript("window.scrollBy(0,2000)");
//Thread.sleep(5000);
//js.executeScript("window.scrollBy(0,-300)");
//Thread.sleep(5000);
}
}
