package com.prueba.Automatizacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prueba_Automatizacion {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");
	
	By usernameLocator = By.name("email");
	By passwordLocator = By.name("password");
	By confirmPasswordLocator = By.name("confirmPassword");
	By registerBLocator = By.className("register");
	
	By userLocator = By.name("userName");
	By passLocator = By.name("password");
	By signInBLocator = By.name("login");
	
	By homePageLocator = By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']");
	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chomedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://demo.guru99.com/test/newtours/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void registerUser()  throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(5000);
		if(driver.findElement(registerPageLocator).isDisplayed() ) {
			driver.findElement(usernameLocator).sendKeys("usuario1");
			driver.findElement(passwordLocator).sendKeys("pass1");
			driver.findElement(confirmPasswordLocator).sendKeys("pass1");
			
			driver.findElement(registerBLocator).click();
			
		}
		
		else {
			
			System.out.print("No se encontro registro");
		}
		
		List<webElement> fonts =driver.findElement(By.tagName("font"));
		 
		assertEquals("Nota: tu nombre de usuario es Usuario1	.",fonts.get(5).getText());
		
	}
 
	@Test 
	public void signIn ()  {
		
		if (driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("usuario1");
			driver.findElement(passLocator).sendKeys("pass1");
			driver.findElement(signInBLocator).click();
			Thread.sleep(5000);
			assertTrue(driver.findElement(homePageLocator).isDisplayed());
			
			else
				System.out.printIn("No se puede ingresar, verifique campos ingresados");

			
		}
	}
	
}
