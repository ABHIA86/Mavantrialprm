package basepkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseurl {
	ChromeDriver driver;
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	

}
