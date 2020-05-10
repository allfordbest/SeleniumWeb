import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class auto1 {
	static WebDriver driver = null;

	@Test
	public static void test1() {
		System.out.println("God");
	}
	@Test
	public static void test2() {
		System.out.println("test2");
	}

	@BeforeMethod
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public static void closeBrowser() {
		driver.quit();
	}
}
