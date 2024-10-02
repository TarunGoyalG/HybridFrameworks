package Multi;

import org.testng.annotations.Test;

public class Mul {
@Test(groups={"sanity","smoke"})
public void m1() {
	System.out.println("m1");
}

@Test(groups={"smoke"})
public void m2() {
	System.out.println("m2");
}

@Test(groups={"sanity","regression","smoke"})
public void m3() {
	System.out.println("m3");
}

@Test(groups={"sanity","regression"})
public void m4() {
	System.out.println("m4");
}

@Test(groups={"regression","smoke"})
public void m5() {
	System.out.println("m5");
}

@Test(groups={"sanity"})
public void m6() {
	System.out.println("m6");
}

@Test(groups={"regression"})
public void m7() {
	System.out.println("m7");
}

@Test(groups={"regression","aman"})
public void m8() {
	System.out.println("m8");
}

@Test(groups={"smoke","aman"})
public void m9() {
	System.out.println("m9");
}


}
