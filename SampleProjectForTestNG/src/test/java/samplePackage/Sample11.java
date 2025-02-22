package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample11 {
	@Test
public void tasteCase1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	@Test
public void tasteCase2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
}
