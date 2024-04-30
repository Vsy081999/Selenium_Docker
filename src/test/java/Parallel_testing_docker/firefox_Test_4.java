package Parallel_testing_docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class firefox_Test_4 {

	@Test
	public void test_1() throws MalformedURLException {
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
	DesiredCapabilities dc = DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of the page  :" + driver.getTitle());
		driver.quit();
	}
}