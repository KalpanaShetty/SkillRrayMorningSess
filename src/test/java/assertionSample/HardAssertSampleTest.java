package assertionSample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertSampleTest {
@Test
public void createProjectTestr() {
System.out.println("step1");
System.out.println("step2");
SoftAssert s= new SoftAssert();
s.assertEquals("A", "B");
System.out.println("step3");
s.assertEquals("C", "Y");
System.out.println("step4");
}
@Test
public void updateProjectTestr() {
	System.out.println("step1");
	System.out.println("step2");	
}
}
