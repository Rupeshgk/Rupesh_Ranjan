package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class Printtext {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	// implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://integrator.actitime.com/auth/at");
	//explicit wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
}
}
