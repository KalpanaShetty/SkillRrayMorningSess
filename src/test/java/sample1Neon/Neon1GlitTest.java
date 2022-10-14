package sample1Neon;

import org.testng.annotations.Test;

import com.skilrary.genericUtility.BaseClass;

public class Neon1GlitTest extends BaseClass{
@Test(groups = "smokeTest")
public void glit1NeonTest() {
	System.out.println("project created1");
}
@Test(groups = "regressionTest")
public void glit2NeonTest() {
	System.out.println("project created2");
}
}
