package qsp;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chekbox {
public static void main(String[] args){
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Check Box']")).click();
	List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<allcheckbox.size();i++)
		allcheckbox.get(i).click();
	{
	}
	for(int i=allcheckbox.size()-1;i>=0;i--)
	{
		allcheckbox.get(i).click();
	}
}
}
