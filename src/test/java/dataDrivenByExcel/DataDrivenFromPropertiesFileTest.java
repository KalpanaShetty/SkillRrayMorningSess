package dataDrivenByExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.skilrary.genericUtility.BaseClass;

public class DataDrivenFromPropertiesFileTest extends BaseClass{

	public static void main(String[] args) throws IOException {
		
//create java representation object of physical file
		FileInputStream fis =new FileInputStream("./TestData/data.properties");
	//create the object of property class to load all the keys
		Properties pobj= new Properties();
		pobj.load(fis);
		//read the value
		String URL = pobj.getProperty("url");
		String UN = pobj.getProperty("username");
		String PWD = pobj.getProperty("password");
		String BW = pobj.getProperty("browser");
		System.out.println(URL+" "+UN+" "+PWD+" "+BW);
		
	
	}

}
