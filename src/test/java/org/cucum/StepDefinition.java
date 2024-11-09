package org.cucum;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	PojoClass p;
	
	@Given("Open the Facebook application through chrome browser")
	public void open_the_Facebook_application_through_chrome_browser() {
		chromeDriver();
		maxWindow();
		getUrl("https://www.facebook.com/");
		
	}

	@When("Enter the Invalid username and Valid Password")
	public void enter_the_Invalid_username_and_Valid_Password() throws InterruptedException {
		
		p = new PojoClass();
		WebElement txtUser = p.getTxtUser();
		sendValue(txtUser, "smart");
		
		Thread.sleep(2000);
		
		WebElement txtPass = p.getTxtPass();
		sendValue(txtPass, "12345");
		
		System.out.println("Values has passed");
		
	}

	@When("To Click Login Button")
	public void to_Click_Login_Button() throws InterruptedException {
		
//		Thread.sleep(2000);
		p = new PojoClass();
		p.getButcli();
	}

	@Then("Close the Chrome browser")
	public void close_the_Chrome_browser() {
		
//		closeBrowser();
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
