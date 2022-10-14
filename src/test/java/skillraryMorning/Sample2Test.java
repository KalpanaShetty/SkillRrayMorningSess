package skillraryMorning;

import org.testng.annotations.Test;

public class Sample2Test {
@Test
public void createContactTest() {
System.out.println("created");
int[] arr= {1,2,3};
System.out.println(arr[5]);
}
@Test(dependsOnMethods = "createContactTest")
public void editContactTest() {
	System.out.println("edited");
}
@Test(dependsOnMethods = "editContactTest")
public void deleteContactTest() {
System.out.println("deleted");	
}

}
