package Keyworddriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Keyword_Excelsheet.Xls_Reader;

public class Keyword {
static WebDriver driver;
	public static void main(String[] args)
	{
	String Excel=System.getProperty("user.dir")+"\\new keyword.xlsx";	
	System.out.println(Excel);
	String demo="Testcase1";
	String test="Teststep1";
	System.out.println(demo);
	Xls_Reader xls=new Xls_Reader(Excel);
	System.out.println(xls);
	int row=xls.getRowCount(demo);
	int rowcount=xls.getRowCount(test);
	System.out.println("sheet1: "+row);
	System.out.println("sheet2: "+rowcount);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\browsers\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	for(int i=2;i<=row;i++)
	{
		System.out.println("running till");
	if(xls.getCellData(demo,"Execution",i).equals("Naveena"))
	{ 
		System.out.println("jhguygxu");
		for(int j=2;j<=rowcount;j++)
		{
			if(xls.getCellData(demo, "TestCaseId", i).equals(xls.getCellData(test, "TestCaseID", j)))
					{
				System.out.println("second for-loop");
				String prop=xls.getCellData(test, "Property", j);
				String propval=xls.getCellData(test, "PropertyValue", j);
				String key=xls.getCellData(test, "Keyword",j);
				String data=xls.getCellData(test, "TestInput", j);
				
				switch(p.valueOf(key)){
				case Launch:
				{
					System.out.println("8885556");
					if(xls.getCellData(demo, "Status",i).equals("fail")){
						System.out.println("failed");
						break;
					}else{
						driver=sample.Launch(driver,i,xls,data,j,demo,test);
						System.out.println("jsiuid");
						break;
					}
				}
			case MouseClick:
				{
					if(xls.getCellData(demo, "Status",i).equals("fail"))
					{
						System.out.println("failed");
						break;
					}else{
						driver=sample.MouseClick(driver,i,xls,j,demo,test,prop,key,propval);
						System.out.println("mouseover");
						break;
					}
				}
				default:
					break;
				
	case Click:{
			System.out.println("565665");
				if(xls.getCellData(demo, "Status", i).equals("fail"))
				{
						System.out.println("Failed");
						break;
				}else{
				  driver=sample.Click(driver,demo,test,i,j,prop,propval,key,data,xls);
				  break;
			}
					
				}
				
/*	case Enter:{
  			System.out.println("745456456");
				if(xls.getCellData(demo, "Status",i).equals("fail")){
					System.out.println("failed");
					break;
				}else{
					driver=sample.Enter(driver,demo,test,i,j,prop,propval,key,data,xls);
					break;
				}
			}	
				
	*/			
				}
					}
		}
	}
	}

}
	public enum p{
		
		Launch,MouseClick,Click,Enter;
	}
}