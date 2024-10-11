package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgetpassinactitime {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login");
	String text=driver.findElement(By.id("Use password recovery function of your actiTIME")).getText();
	System.out.println(text);
	driver.quit();
}
}
