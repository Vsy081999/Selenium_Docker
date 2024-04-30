package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Docker_with_chrome {

	public WebDriver driver;
	@BeforeClass
	@Parameters({ "browserType" })
	public void setup(String browserType) throws MalformedURLException  {
		DesiredCapabilities capabilites= new DesiredCapabilities();

		if (browserType.equalsIgnoreCase("chrome")) {
			capabilites.setBrowserName(BrowserType.CHROME);
		} else {
			capabilites.setBrowserName(BrowserType.FIREFOX);
		}

//		URL url = new URL("http://localhost:4444/wd/hub");
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilites);
	}
}
