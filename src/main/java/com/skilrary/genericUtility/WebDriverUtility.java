package com.skilrary.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * consist of all the methods related to webdriver
 * @author Kalpana Shetty
 *
 */
public class WebDriverUtility {
/**
 * this mehod will wait implicitly
 * @param driver
 */
public void implicitlyWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
}
/**
 * this method will wait explicitly
 * @param driver
 * @param element
 */
public void explictlyWait(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(element));
}
/**
 * this method helps to handle dropdown using visble text
 * @param element
 * @param option
 */
public void select(WebElement element, String option) {
	Select select= new Select(element);
	select.selectByVisibleText(option);
}
}
