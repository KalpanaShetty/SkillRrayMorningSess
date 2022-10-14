package com.skillrary.pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//Rule1.:- create saparate java class for every web page

	public LoginPage(WebDriver driver) { //Rule3:-crrate constrtor to initlize elements
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "user_name")//Rule2:- identify all thre elemnt using @findby @findby or @findall
	private WebElement userNameEdt;
	
	@FindBy(name = "user_password")
	private WebElement userPasswordEdt;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;//rule4:- elements private use getters to use them

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getUserPasswordEdt() {
		return userPasswordEdt;
	}
     /**
      * it will return login button
      * @author Kalpana Shetty
      * @return
      */
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	/**
	 * This method is used to login to the application
	 * @author Kalpana Shetty
	 * @param userName
	 * @param password
	 */
	public void loginToApp(String userName,String password) {
		userNameEdt.sendKeys(userName);
		userPasswordEdt.sendKeys(password);//rule 5
		loginBtn.click();
		
		
	}
	
	
}
