package skillraryMorning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SampleScreenshotTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.com/");
//explicitly type cast fromdriver to takescreenshot
//EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
//File temp=edriver.getScreenshotAs(OutputType.FILE);
TakesScreenshot ts=(TakesScreenshot) driver;
//take the screenshot and it will be in temp memory
File temp = ts.getScreenshotAs(OutputType.FILE);
//create a permanent memory
File pm = new File("./Sample3/amazo2n.png");
//copy ss from temp to permanent
FileUtils.copyFile(temp, pm);
	}

}
