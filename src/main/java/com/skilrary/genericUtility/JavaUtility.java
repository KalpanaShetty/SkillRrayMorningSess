package com.skilrary.genericUtility;

import java.util.Date;
import java.util.Random;

/**
 * This class consist of java specific generic methods
 * @author Kalpana Shetty
 *
 */
public class JavaUtility {
/**
 * This method is used to generate the integer random number with in boundary
 * @return
 */
	public int getRandomNumber() {
		Random random= new Random();
		int randomNum = random.nextInt(1000);
		return randomNum;
	}
	/**
	 * This  method gives current system date and time
	 * @return
	 */
	public String getSystemDate() {
		Date date= new Date();
		String systemDateAndTime = date.toString();
		return systemDateAndTime;
	}
}
