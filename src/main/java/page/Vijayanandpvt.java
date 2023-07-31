package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Vijayanandpvt {
	WebDriver driver;
	
	By source=By.xpath("//*[@id=\"FromCity\"]");
	By destination=By.xpath("//*[@id=\"ToCity\"]");
	By dates=By.xpath("//*[@id=\"txtFromDate\"]");
	By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	public Vijayanandpvt(WebDriver driver) {
		this.driver=driver;
	}
	public void setDetails(String fromcity,String tocity,String date) {
		driver.findElement(source).sendKeys(fromcity);
		driver.findElement(destination).sendKeys(tocity);
		driver.findElement(dates).clear();
	
	}
	public void searchbutton() {
		driver.findElement(search).click();
	}
	

}
