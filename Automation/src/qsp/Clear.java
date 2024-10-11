package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='privacy policy']")).click();
	Set<String> allwh = driver.getWindowHandles();
	for(String s : allwh)
	{
		driver.switchTo().window(s);
	}
	driver.findElement(By.xpath("//p[text()='Contact']")).click();
}
}
