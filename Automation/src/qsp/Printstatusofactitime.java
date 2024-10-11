package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printstatusofactitime {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("htpps://demo.actitime.com/login");
	boolean result=driver.findElement(By.xpath("//input[@name='remeber']")).isSelected();
	System.out.println(result);
	driver.quit();
}
}
