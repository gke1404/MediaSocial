package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{


	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id="email")
		private WebElement txtUser;
		
		@FindBy(name="pass")
		private WebElement txtPass;
		
		@FindBy(xpath="//button[text()='Log in']")
		private WebElement butcli;
		
		public WebElement getTxtUser() {
			return txtUser;
		}

		public WebElement getTxtPass() {
			return txtPass;
		}

		public WebElement getButcli() {
			butcli.click();
			return butcli;
		}
		
	
	
}
