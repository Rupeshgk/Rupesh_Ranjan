package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("APjFqb")).sendKeys("java");
	List<WebElement> allsugg=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	int count=allsugg.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String text=allsugg.get(i).getText();
		System.out.println(text);
	}
	for(int i=count-1;i>=0;i--)
	{

		System.out.println();
	}
}
}
