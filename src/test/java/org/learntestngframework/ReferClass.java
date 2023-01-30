package org.learntestngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReferClass  {
	
	@Test
	public void loginPage()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/login");
		LoginPageObject.userName(driver).sendKeys("user@phptravels.com");
		LoginPageObject.password(driver).sendKeys("demouser");
		LoginPageObject.loginButton(driver).click();
		
}

}
