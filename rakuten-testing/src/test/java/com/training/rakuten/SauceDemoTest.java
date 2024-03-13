package com.training.rakuten;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.*;

public class SauceDemoTest {

	WebDriver driver;

	@BeforeAll
	static void setupAll() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeEach
	void setup() {
		driver = new ChromeDriver();
	}

	@AfterEach
	void teardown() {
		driver.quit();
	}
	
	@Test
	public void testSauceDemoLoginTest() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		String expected = "https://www.saucedemo.com/inventory.html";
		String actual = driver.getCurrentUrl();
		assertEquals(expected, actual);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}