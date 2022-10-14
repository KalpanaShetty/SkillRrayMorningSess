package com.skilrary.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.skillrary.pomUtility.LoginPage;

public class BaseClass {
public WebDriver driver;
@BeforeSuite(groups = {"smokeTest","regressionTest"})
public void confugBS() {
	System.out.println("db connection done");
}

@BeforeClass(groups = {"smokeTest","regressionTest"})
public void configBC() {
System.out.println("launch the browser");	

}
@BeforeMethod(groups = {"smokeTest","regressionTest"})
public void configBM() throws Throwable {
	System.out.println("login");

}
@AfterMethod(groups = {"smokeTest","regressionTest"})
public void configAM() {
	System.out.println("logout");
}
@AfterClass(groups = {"smokeTest","regressionTest"})
public void configAC() {
	System.out.println("close the browser");
}
@AfterSuite(groups = {"smokeTest","regressionTest"})
public void configAS() {
	System.out.println("close DB");
}
}
