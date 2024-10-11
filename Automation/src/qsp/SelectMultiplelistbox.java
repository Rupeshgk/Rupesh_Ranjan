package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultiplelistbox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Hp/Desktop/mtr.html");
	WebElement mtrlistBox=driver.findElement(By.id("mtr"));
	Select s=new Select(mtrlistBox);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.selectByValue("v");
	Thread.sleep(2000);
	s.selectByVisibleText("dosa");
	Thread.sleep(2000);
	s.deselectByIndex(0);
	Thread.sleep(2000);
	s.deselectByValue("v");
	Thread.sleep(2000);
	s.deselectByVisibleText("dosa");
	
	boolean ststus=s.isMultiple();
	System.out.println(ststus);
	driver.quit();
}
}
