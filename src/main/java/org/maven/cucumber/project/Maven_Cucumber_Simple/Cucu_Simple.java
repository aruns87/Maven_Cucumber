package org.maven.cucumber.project.Maven_Cucumber_Simple;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucu_Simple {
	static WebDriver driver;

	@Given("The user is in guru99 bank login page")
	public void the_user_is_in_guru99_bank_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"D:\\Arun\\Maven_Cucumber_Project1\\Maven_Cucumber_Simple\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/index.php");
	}

	@When("The user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement txtUsername = driver.findElement(By.name("uid"));
		txtUsername.sendKeys("mngr162435");
		WebElement txtPass = driver.findElement(By.name("password"));
		txtPass.sendKeys("satebyp");

	}

	@When("The user clicks on submit button")
	public void the_user_clicks_on_submit_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement btnLogin = driver.findElement(By.name("btnLogin"));
		btnLogin.click();
	}

	@Then("The user should be in managers home page")
	public void the_user_should_be_in_managers_home_page() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
	}
	
	@Given("The user is in guru99 new customer page")
	public void the_user_is_in_guru99_new_customer_page() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement menuSelect = driver.findElement(By.xpath("//a[text()='New Customer']"));
	    menuSelect.click();
	    
	}

	@When("The basic details of the customer with mandatory fields is filled")
	public void the_basic_details_of_the_customer_with_mandatory_fields_is_filled() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("name")).sendKeys("Arun");
	   driver.findElement(By.xpath("(//input[@name='rad1'])[1]")).click();
	   driver.findElement(By.id("dob")).sendKeys("02-04-1987");
	   driver.findElement(By.name("addr")).sendKeys("Erode");
	   driver.findElement(By.name("city")).sendKeys("Erode");
	   driver.findElement(By.name("state")).sendKeys("TN");
	   driver.findElement(By.name("pinno")).sendKeys("638011");
	   driver.findElement(By.name("telephoneno")).sendKeys("9087654321");
	   driver.findElement(By.name("emailid")).sendKeys("someone@gmail.com");
	   
	}

	@When("The user clicks on new user submit button")
	public void the_user_clicks_on_new_user_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("sub")).click();
	}

	@Then("The user should allowed to enroll as new customer")
	public void the_user_should_allowed_to_enroll_as_new_customer() {
	    // Write code here that turns the phrase above into concrete actions
		SoftAssert s = new SoftAssert();
	    s.assertTrue(driver.getCurrentUrl().contains("addcustomerpage"));
	    s.assertTrue(true,"Enter Mandatory Fields");
	}

}
