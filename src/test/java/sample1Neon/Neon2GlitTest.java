package sample1Neon;

import org.testng.annotations.Test;

import com.skilrary.genericUtility.BaseClass;

public class Neon2GlitTest extends BaseClass{
	@Test(groups = "smokeTest")
	public void glit3NeonTest() {
		System.out.println("project created3");
	}
	@Test(groups="regressionTest")
	public void glit4NeonTest() {
		System.out.println("project created4");
	}
}
