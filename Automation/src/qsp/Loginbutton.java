package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginbutton {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	boolean result=driver.findElement(By.id("loginbutton")).isDisplayed();
	System.out.println(result);
	driver.close();
}
}
