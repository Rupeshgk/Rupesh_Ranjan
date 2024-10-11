package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://integrator.actitime.com/auth/at");
	boolean result=driver.findElement(By.xpath("//input[@name='remember']")).isSelected();
	System.out.println(result);
	driver.quit();
}
}
