package com.skilrary.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * consit of methods related to properties file
 * @author Kalpana Shetty
 *
 */
public class FileUtility {
	/**
	 * This method used to read the data from properties file according to the keys passed
	 * @param key
	 * @return
	 * @throws Throwable
	 */
public String getPropertyKeyValue(String key) throws Throwable {
	FileInputStream fis =new FileInputStream("./TestData/data.properties");
	//create the object of property class to load all the keys
		Properties pobj= new Properties();
		pobj.load(fis);
		//read the value
		String value = pobj.getProperty(key);
		return value;
	
}
}
