package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkfacebooklogo {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	boolean logo=driver.findElement(By.xpath("//img[@class='_97vu img']")).isDisplayed();
	if(logo==true)
	{
		System.out.println("logo is displayed");
	}
		else
		{
			System.out.println("logo is not displayed");
		}
	}

}
