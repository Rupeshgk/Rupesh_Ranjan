package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) {
	//open the  chrome browser 
	WebDriver driver =new  ChromeDriver();
	//enter the url
	driver.get("https://www.google.com/");
	//getting the window title
	String title = driver.getTitle();
	//print on the console
	System.out.println(title);
	//close the browser
	driver.quit();
	
}
}
