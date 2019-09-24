package Keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Keyword_Excelsheet.Xls_Reader;

public class sample {
	public static WebDriver Launch(WebDriver driver, int i, Xls_Reader xls,	String data, int j, String demo, String test) {
		driver.get(data);
		System.out.println("888888");
		try{
			xls.setCellData(demo, "Status", i, "pass");
			xls.setCellData(test, "Status", j, "pass");
			xls.setCellData(test, "Comments", j, "running successfully");
		}
		catch(Exception e)
		{
			xls.setCellData(demo, "Status", i, "fail");
			xls.setCellData(test, "Status", j, "fail");
			xls.setCellData(test, "Comments", j, " not running successfully");
		}
		return driver;
	}
	public static WebDriver MouseClick(WebDriver driver, int i, Xls_Reader xls,int j, String demo, String test, 
			String prop, String key, String propval) {
		System.out.println("464654");
			System.out.println("working");
			WebElement s=driver.findElement(By.xpath("//span[@class='nav-line-2'][contains(text(),'Account & Lists')]"));
			System.out.println(s.isDisplayed());
			//span[@class='nav-action-inner']
System.out.println("6545353");
	Actions act=new Actions(driver);
		switch(q.valueOf(prop)){
		case id:
			WebElement parent=driver.findElement(By.id(propval));
			act.moveToElement(parent).perform();
			break;
		case name:
			WebElement parent1=driver.findElement(By.name(propval));
			act.moveToElement(parent1).perform();
			break;
		case className:
			WebElement parent2=driver.findElement(By.className(propval));
			act.moveToElement(parent2).perform();
			break;
		case linkText:
			WebElement parent3=driver.findElement(By.linkText(propval));
			act.moveToElement(parent3).perform();
			break;
		case xpath:
			WebElement parent4=driver.findElement(By.xpath(propval));
			act.moveToElement(parent4).perform();
			System.out.println("jkhjh");
			break;
		}
	     s.click();
	     try{
		 xls.setCellData(demo, "Status", i, "Pass");
		xls.setCellData(test, "Status", j, "Pass");
		xls.setCellData(test, "Comments", j, "running successfully");
	}catch(Exception e){
	xls.setCellData(demo, "Status", i, "fail");
	xls.setCellData(test, "Status", j, "fail");
	xls.setCellData(test, "Status", j, "Not running Successfully");
}
return driver;
	}
	public static WebDriver Click(WebDriver driver, String demo, String test, int i, int j, String prop, String propval, String key, String data, Xls_Reader xls)
	{
		System.out.println("pokok");
		switch (q.valueOf(prop)){
		case id:
			driver.findElement(By.id(propval)).click();
			break;
		case name:
			driver.findElement(By.name(propval)).click();
			break;
		case xpath:
			driver.findElement(By.xpath(propval)).click();
			break;
		case className:
			driver.findElement(By.className(propval)).click();
			break;
		case linkText:
			driver.findElement(By.linkText(propval)).click();
			break;
		}
		return driver;
	}
	
/*	public static WebDriver Enter(WebDriver driver, String demo, String test, int i, int j, String prop, String propval, String key, String data) {
		switch (q.valueOf(propval)){
		case id:
			driver.findElement(By.id(propval)).sendKeys(key);
			break;
		case name:
			driver.findElement(By.name(propval)).sendKeys(key);
			break;
		case xpath:
			driver.findElement(By.xpath(propval)).sendKeys(key);
			break;
		case className:
			driver.findElement(By.className(propval)).sendKeys(key);
			break;
		case linkText:
			driver.findElement(By.linkText(propval)).sendKeys(key);
			break;
		}
		try{
			xls.setCellData(demo, "Status", i, "pass");
			xls.setCellData(test, "Status", j, "pass");
			xls.setCellData(test, "Comments", j, "running successfully");
		}
		catch(Exception e)
		{
			xls.setCellData(demo, "Status", i, "fail");
			xls.setCellData(test, "Status", j, "fail");
			xls.setCellData(test, "Comments", j, " not running successfully");
		}
		return null;
	}

	public static WebDriver Click(WebDriver driver, String demo, String test,int i, int j, String prop, String propval, String key, String data) {
		switch (q.valueOf(propval)){
		case id:
			driver.findElement(By.id(propval)).click();
			break;
		case name:
			driver.findElement(By.name(propval)).click();
			break;
		case xpath:
			driver.findElement(By.xpath(propval)).click();
			break;
		case className:
			driver.findElement(By.className(propval)).click();
			break;
		case linkText:
			driver.findElement(By.linkText(propval));
			break;
		}
		try{
			xls.setCellData(demo, "Status", i, "pass");
			xls.setCellData(test, "Status", j, "pass");
			xls.setCellData(test, "Comments", j, "running successfully");
		}
		catch(Exception e)
		{
			xls.setCellData(demo, "Status", i, "fail");
			xls.setCellData(test, "Status", j, "fail");
			xls.setCellData(test, "Comments", j, " not running successfully");
		}
		return null;
	}*/
	public enum q{
		id,name,xpath,linkText,className;
	}

	
	
}
