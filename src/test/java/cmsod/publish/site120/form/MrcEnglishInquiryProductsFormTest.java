package cmsod.publish.site120.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MrcEnglishInquiryProductsFormTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://testform.mrc.co.jp";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testMrcEnglishInquiryProductsFormTest() throws Exception {
		driver.get(baseUrl + "/english/inquiry/products_form.html");
		new Select(driver.findElement(By.id("theme"))).selectByVisibleText("Plastic optical fibers, ESKA");
		driver.findElement(By.name("subject")).clear();
		driver.findElement(By.name("subject")).sendKeys("Subject");
		driver.findElement(By.name("mrms")).click();
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("Name");
		driver.findElement(By.name("company")).clear();
		driver.findElement(By.name("company")).sendKeys("Company");
		driver.findElement(By.name("division")).clear();
		driver.findElement(By.name("division")).sendKeys("Division");
		driver.findElement(By.name("postal")).clear();
		driver.findElement(By.name("postal")).sendKeys("1111");
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("Address");
		driver.findElement(By.name("country")).clear();
		driver.findElement(By.name("country")).sendKeys("v");
		driver.findElement(By.name("country")).clear();
		driver.findElement(By.name("country")).sendKeys("Country");
		driver.findElement(By.name("tel")).clear();
		driver.findElement(By.name("tel")).sendKeys("000-000-0000");
		driver.findElement(By.name("fax")).clear();
		driver.findElement(By.name("fax")).sendKeys("000-000-0000");
		driver.findElement(By.name("email1")).clear();
		driver.findElement(By.name("email1")).sendKeys("gmail@gmail.com");
		driver.findElement(By.name("email2")).clear();
		driver.findElement(By.name("email2")).sendKeys("gmail@gmail.com");
		driver.findElement(By.name("message")).clear();
		driver.findElement(By.name("message")).sendKeys("Your message");
		// ERROR: Caught exception [ERROR: Unsupported command [chooseCancelOnNextConfirmation |  | ]]
		driver.findElement(By.name("send")).click();
		// ERROR: Caught exception [TypeError: can't access dead object]
		driver.findElement(By.name("send")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}