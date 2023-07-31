package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Project1amazon;

public class Projectamazon1 {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	@Test
	public void test1() {
		Project1amazon ob=new Project1amazon(driver);
		ob.setDetails("mobile", null);
		ob.searchbutton();
		
	
	}
	

}
