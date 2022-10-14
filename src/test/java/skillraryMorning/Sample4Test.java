package skillraryMorning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample4Test {
@Test(dataProvider = "dataproviderSample")
public void bookTicketTest(String fro,String dst) {
	System.out.println("book ticket from "+ fro+"to "+dst);
}

@DataProvider
public Object[][] dataproviderSample() {
	Object[][] objArr= new Object[3][2];
	objArr[0][0]="Banglore";
	objArr[0][1]="UAS";
	
	objArr[1][0]="Banglore";
	objArr[1][1]="Paris";
	
	objArr[2][0]="BAnglore";
	objArr[2][1]="Aus";
	
	return objArr;
	
}
}
