package Docker;

import org.testng.annotations.Test;

public class Test_file extends Docker_with_chrome {

	@Test
	public void m1() {
		driver.get("https://www.google.com/");
		System.out.println("m1");
	}

	@Test
	public void m2() {
		driver.get("https://www.facebook.com/");
		System.out.println("m2");
	}

	@Test
	public void m3() {
		driver.get("https://www.flipkart.com/");
		System.out.println("m3");
	}
	
	@Test
	public void m4() {
		driver.get("https://www.amazon.in/");
		System.out.println("m4");
	}


}
