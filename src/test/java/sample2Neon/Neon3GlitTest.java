package sample2Neon;

import org.testng.annotations.Test;

import com.skilrary.genericUtility.BaseClass;

public class Neon3GlitTest extends BaseClass{
	@Test(groups = "smokeTest")
	public void glit5NeonTest() {
		System.out.println("project created5");
	}
	@Test(groups = "regressionTest")
	public void glit6NeonTest() {
		System.out.println("project created6");
	}
}
