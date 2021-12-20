package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {

	private WebDriver driver;
	
	public Base(WrbDriver driver) {
		this.driver = driver;
		
}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chomedriver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	
public webElement findElement (By locator) {
	return driver.findElement(locator);
}

public List<WebElement> findElements (By locator) {
	return driver.findElement(locator);
}

public String getText(WebElement element) {
	return element.getText();
}

public String getText(By locator) {
	return driver.findElement(locator).getText();
}

public void type(String inputText, By locator ) {
	driver.findElement(locator).sendKeys(inputText);
}
 
public void click(By locator) {
	driver.findElement(locator).click();
}

public Boolean isDisplayed(By.locator) {
	try {
		return drive.findElement(locator).isDisplayed();			
				
	} catch (org.openqa.selenium.NoSuchElementExeption e) {
		return false;
		
	}
	public void visit(String url) {
		driver.get(url);
	}
}
} 
