package base.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	public static WebDriver driver;
public static String value;

public static WebDriver getBrowser(String browser)
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chrome2\\chromedriver.exe");
	 driver=new ChromeDriver();
	 return driver;
}
public static void select(String type,WebElement e,String text)
{
	if(type.equalsIgnoreCase("visibletext")) {
		
		Select s=new Select(e);
		s.selectByVisibleText(text);
	}
	else if(type.equalsIgnoreCase("index"))
	{
		Select s=new Select(e);
		int index = Integer.parseInt(text);
		s.selectByIndex(index);
	}
	else if(type.equalsIgnoreCase("value"))
	{
		Select s=new Select(e);
		s.selectByValue(text);
	}
	
}
	public static void geturl(String u)
	{
		driver.get(u);
	}
	public static void click_on_webelement(WebElement e)
	{
      e.click();
	}
	
	public static void sendinput(WebElement e,String s)
	{
		e.sendKeys(s);
	}
	public static void close()
	{
		driver.close();
	}
	public static void quit()
	{
		driver.quit();
	}
	public static void navigate_to(String url)
	{
		driver.navigate().to(url);
	}
	public static void nav_back()
	{
		driver.navigate().back();
	}
	public static void nav_forward()
	{
		driver.navigate().forward();
	}
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	public static void simple_alert(WebElement e) throws InterruptedException
	{
		click_on_webelement(e);
	     Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public static void confirm_alert(WebElement e,WebElement e1,String type) throws InterruptedException
	{
		if(type.equalsIgnoreCase("ok"))
		{
		click_on_webelement(e);
		Thread.sleep(2000);
		click_on_webelement(e1);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
		else if(type.equalsIgnoreCase("cancel"))
		{
			click_on_webelement(e);
			Thread.sleep(2000);
			click_on_webelement(e1);
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
		}
		}
		public static void prompt_alert(WebElement e,WebElement e1,String keys) throws InterruptedException
		{
			click_on_webelement(e);
			Thread.sleep(2000);
			click_on_webelement(e1);
			Thread.sleep(2000);
			driver.switchTo().alert().sendKeys(keys);
			driver.switchTo().alert().accept();
		}
		
		public static void frames( WebElement f1) throws InterruptedException
		{
			
				driver.switchTo().frame(f1);
     			
		}
		
		public static String get_title()
	{
		return(driver.getTitle());
		
	}	
public static String get_cur_url()	
{
return(driver.getCurrentUrl());
}
public static String get_pagesrc()
{
	return(driver.getPageSource());
}
public static String get_text(WebElement e)
{
	return(e.getText());
}
public static void get_options(WebElement e)
{
	
	Select s=new Select(e);
	List<WebElement> list = s.getOptions();
	for (WebElement webElement : list) {
		System.out.println(get_text(webElement));
	}
}
	public static void get_sel_opt(WebElement e)
	{
		Select s=new Select(e);
		List<WebElement> list = s.getAllSelectedOptions();
		for (WebElement webElement : list) {
			System.out.println(get_text(webElement));
		}
	}

	public static boolean is_multiple(WebElement e)
	{
		Select s=new Select(e);
		return(s.isMultiple());
	}
	public static void get_first_sel_opts(WebElement e)
	{
		Select s=new Select(e);
	System.out.println(s.getFirstSelectedOption().getText());
	}
	
	public static void droppable(WebElement from,WebElement to)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(from,to).build().perform();
}
	
	public static void context_click(WebElement e)
	{
		Actions a=new Actions(driver);
		a.contextClick(e).build().perform();
}		
public static void double_click(WebElement e)
{
	Actions a=new Actions(driver);
	a.doubleClick(e).build().perform();
}
public static void clickandhold(WebElement from,WebElement to)
{
	Actions a=new Actions(driver);
	a.clickAndHold(from).moveToElement(to).release().perform();
}
public static void robot(WebElement e) throws AWTException
{
	Robot r=new Robot();
	context_click(e);
	r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
public static void get_win_handles()
{
	Set<String> wh = driver.getWindowHandles();
	for (String string : wh) {
	String string2 = driver.switchTo().window(string).getTitle();
	System.out.println(string2);
	}
}
public static String get_window_handle()
{
	 String s=driver.getWindowHandle();
	 return(driver.switchTo().window(s).getTitle());
}
public static void scr_upanddown(String type)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript(type);
}
public static void wait_imp()
{
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
}
public static void screen_shot(String type) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
    File source= ts.getScreenshotAs(OutputType.FILE);
    File destination=new File(type);
    FileUtils.copyFile(source, destination);
}
public static String get_attr(WebElement e)
{
	return(e.getAttribute("value"));
}
public static boolean is_display(WebElement e)
{
	return(e.isDisplayed());
}
public static String read_particular_Data(String path,int row_index,int cell_index) throws IOException
{
	File f=new File(path);
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(1);
	Row row = sheetAt.getRow(row_index);
	Cell cell = row.getCell(cell_index);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
		value = cell.getStringCellValue();
	}
	else if(cellType.equals(CellType.NUMERIC))
	{
double numericCellValue = cell.getNumericCellValue();
int data=(int) numericCellValue;
value=String.valueOf(data);
	}
	wb.close();
	return value;
	
}

}
	
	
	
	

