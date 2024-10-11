package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize(); 
		System.out.println("Web Element Method");
		driver.get("https://www.google.com/");
		String htmlcode=driver.getPageSource();
System.out.println("htmlcode");
		driver.getTitle();

	}
}
