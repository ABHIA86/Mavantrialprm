package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Project1amazon {
	WebDriver driver;
	
	By amazgonsearchid=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	By search=By.xpath("//*[@id=\"nav-search-submit-button\"]");
	public Project1amazon(WebDriver driver) {
		this.driver=driver;
	}
	public void setDetails(String amazonsearch,String search) {
		driver.findElement(amazgonsearchid).sendKeys(amazonsearch);
		
	}
	public void searchbutton() {
		driver.findElement(search).sendKeys(Keys.ENTER);
	}
	
	
	

}
