package com.training.rakuten;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class GoogleSearch {

    String url = "https://www.google.com/";
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
       
    }


    @Given("user is on search page")
    public void user_is_on_search_page() {
        driver = new ChromeDriver();
        driver.get(url);
    }
    @When("user enters searchtext")
    public void user_enters_searchtext() {
        WebElement searchQuery = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchQuery.sendKeys("Harry Potter");
    }
    @When("clicks on search button")
    public void clicks_on_search_button() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

    }
    @Then("user is navigated to the results page")
    public void user_is_navigated_to_the_results_page() {
        WebElement res = driver.findElement(By.className("MjjYud"));
        assertTrue(res.isDisplayed());
        driver.quit();
    }
}
