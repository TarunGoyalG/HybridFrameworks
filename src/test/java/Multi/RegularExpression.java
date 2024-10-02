package Multi;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RegularExpression {
	@Test(groups={"chrome.sanity"})
	public void m8() {
		System.out.println("m8");
		Assert.fail();
	}
	
	@Test(groups={"chrome.regression"})
	public void m7() {
		System.out.println("m7");
	}
	
	@Test(groups={"firefox.regression"})
	public void m6() {
		System.out.println("m76");
	}

	@Test(groups={"firefox.sanity"})
	public void m5() {
		System.out.println("m5");
	}
}
