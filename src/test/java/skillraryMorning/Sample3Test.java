package skillraryMorning;

import org.testng.annotations.Test;

public class Sample3Test {
	@Test(invocationCount = 4)
	public void editContactTest() {
		System.out.println("create edited");
	}
	@Test(invocationCount = 2)
	public void createContactTest() {
		System.out.println("create contact");
	}
	
}
