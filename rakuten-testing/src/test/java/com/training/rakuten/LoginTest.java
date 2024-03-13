package com.training.rakuten;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1secret_sauce");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		String expected = "https://www.saucedemo.com/inventory.html";
		String actual = driver.getCurrentUrl();
		assertEquals(expected, actual);
		driver.quit();
	}



}
