package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taglocater {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Hp/Desktop/Demo1.html");
	driver.findElement(By.xpath("//a")).click();
	driver.quit();
			
			
			
}
}
