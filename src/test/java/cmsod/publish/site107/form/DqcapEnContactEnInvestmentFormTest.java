package cmsod.publish.site107.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DqcapEnContactEnInvestmentFormTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://testform.dqcap.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testDqcapEnContactEnInvestmentFormTest() throws Exception {
		driver.get(baseUrl + "/en/contact/input");
		new Select(driver.findElement(By.name("inquiryType"))).selectByVisibleText("Investment");
		driver.findElement(By.name("senderName")).clear();
		driver.findElement(By.name("senderName")).sendKeys("Name");
		driver.findElement(By.name("corporateName")).clear();
		driver.findElement(By.name("corporateName")).sendKeys("Company");
		driver.findElement(By.name("mailaddress")).clear();
		driver.findElement(By.name("mailaddress")).sendKeys("gmail@gmail.com");
		driver.findElement(By.name("tel")).clear();
		driver.findElement(By.name("tel")).sendKeys("000-0000-000");
		driver.findElement(By.name("inquiryContents")).clear();
		driver.findElement(By.name("inquiryContents")).sendKeys("Inquiry Details");
		driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
		driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
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