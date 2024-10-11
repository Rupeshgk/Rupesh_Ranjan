package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	String url=driver.getCurrentUrl();
	if(url.equals("https://www.selenium.dev/downloads/"))
	{
		System.out.println("url is successful navigate and pass");
	}
	else
	{
		System.out.println("url is successful not navigate and fail");
	}
	driver.close();
}
}
