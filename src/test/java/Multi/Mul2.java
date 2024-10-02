package Multi;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Mul2 {
@Test(groups={"sanity","smoke"})
public void m1o() {
	System.out.println("m1o");
}

@Test(groups={"smoke"})
public void m2o() {
	System.out.println("m2o");
Assert.fail();
}

@Test(groups={"sanity","regression","smoke"})
public void m30() {
	System.out.println("m30");
}

@Test(groups={"sanity","regression"})
public void m40() {
	System.out.println("m40");
}

@Test(groups={"regression","smoke"})
public void m50() {
	System.out.println("m50");
}

@Test(groups={"sanity"})
public void m60() {
	System.out.println("m60");
}

@Test(groups={"regression"})
public void m70() {
	System.out.println("m70");
}



}
