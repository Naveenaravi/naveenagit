package samplecase;

import java.math.BigDecimal;
//import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Excelsheet.Xls_Reader;

public class ApplyPan {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	String s=System.getProperty("user.dir")+"\\applypan.xlsx";
	String sheet="new";
	System.out.println("45454");
	Xls_Reader xls=new Xls_Reader(s);
	System.out.println("working");
	int column=xls.getColumnCount(sheet);
	System.out.println(column);
	int row=xls.getRowCount(sheet);
	System.out.println(row);
	int i=2;
	test(xls.getCellData(sheet,"FirstName",i),xls.getCellData(sheet,"LastName",i),xls.getCellData(sheet,"MiddleName",i),xls.getCellData(sheet,"Year",i),
	xls.getCellData(sheet,"FirstNamePan",i),xls.getCellData(sheet,"LastNamepan",i),xls.getCellData(sheet,"FirstNameFather",i),
	xls.getCellData(sheet,"LastNameFather",i),xls.getCellData(sheet,"MiddleNameFather",i),xls.getCellData(sheet,"AadharNumber",i),
	xls.getCellData(sheet,"NameinAadhar",i),xls.getCellData(sheet,"MobileNo",i),xls.getCellData(sheet,"Emailid",i),
	xls.getCellData(sheet,"Std",i),xls.getCellData(sheet,"Landline",i),xls.getCellData(sheet,"Flatno",i),xls.getCellData(sheet,"Building",i),
	xls.getCellData(sheet,"Street",i),xls.getCellData(sheet,"Area",i),xls.getCellData(sheet,"Country",i));
	}
	private static void test(String firstname, String lastname,String middlename, String year, String firstnamepan, String lastnamepan, String firstnamefather, 
			String lastnamefather, String middlenamefather, String aadharnumber, String nameinaadhar, String mobileno, String emailid, String std, 
			String landline, String flatno, String building, String street, String area, String country)throws InterruptedException {
			System.out.println("532");
			BigDecimal bd=new BigDecimal(aadharnumber);
			String e=bd.toBigInteger().toString();
			BigDecimal bd1=new BigDecimal(mobileno);
			String q=bd1.toString();
			BigDecimal bd2=new BigDecimal(landline);
			String y=bd2.toString();
			BigDecimal big=new BigDecimal(std);
			String x=big.toString();
			BigDecimal decimal=new BigDecimal(flatno);
			String z=decimal.toString();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.katkada.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(3000);
		System.out.println("454553");
		driver.findElement(By.id("email-form")).sendKeys("sa@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass-form")).sendKeys("shanthi123");
		Thread.sleep(3000);
		System.out.println("Logined in");
		driver.findElement(By.id("sign_in_button")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("applicant_firstname")).sendKeys(firstname);
		Thread.sleep(1000);
		driver.findElement(By.name("applicant_lastname")).sendKeys(lastname);
		Thread.sleep(1000);
		driver.findElement(By.name("applicant_middlename")).sendKeys(middlename);
		Thread.sleep(1000);
		driver.findElement(By.name("dob_year")).sendKeys(year);
		Thread.sleep(10000);
		driver.findElement(By.name("father_firstname")).sendKeys(firstnamefather);
		Thread.sleep(1000);
		driver.findElement(By.name("father_lastname")).sendKeys(lastnamefather);
		Thread.sleep(1000);
		driver.findElement(By.name("father_middlename")).sendKeys(middlenamefather);
		Thread.sleep(1000);
		driver.findElement(By.name("aadhaar_number")).sendKeys(e);
		Thread.sleep(1000);
		driver.findElement(By.name("name_on_aadhaar")).sendKeys(nameinaadhar);
		Thread.sleep(1000);
		driver.findElement(By.name("mobile_number")).sendKeys(q);
		Thread.sleep(000);
		driver.findElement(By.name("email")).sendKeys(emailid);
		Thread.sleep(3000);
		driver.findElement(By.name("std_code")).sendKeys(x);
		Thread.sleep(1000);
		driver.findElement(By.name("landline_no")).sendKeys(y);
		Thread.sleep(1000);
		driver.findElement(By.name("block_no_residence")).sendKeys(z);
		Thread.sleep(1000);
		driver.findElement(By.name("building_residence")).sendKeys(street);
		Thread.sleep(1000);
		driver.findElement(By.name("post_ofc_residence")).sendKeys(area);
		Thread.sleep(1000);
		driver.findElement(By.name("area_locality_residence")).sendKeys(country);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='img-responsive usericonimg']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Alert sign=driver.switchTo().alert();
		sign.accept();
			}
	
}
