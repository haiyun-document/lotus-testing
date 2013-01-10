package cmsod.publish.site107.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DqcapEnContactJpInvestmentFormTest {
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
	public void testDqcapEnContactJpInvestmentFormTest() throws Exception {
		driver.get(baseUrl + "/jp/contact/input");
		new Select(driver.findElement(By.name("inquiryType"))).selectByVisibleText("投資に関して");
		driver.findElement(By.name("senderName")).clear();
		driver.findElement(By.name("senderName")).sendKeys("名前");
		driver.findElement(By.name("corporateName")).clear();
		driver.findElement(By.name("corporateName")).sendKeys("会社名");
		driver.findElement(By.name("mailaddress")).clear();
		driver.findElement(By.name("mailaddress")).sendKeys("gmail@gmail.com");
		driver.findElement(By.name("tel")).clear();
		driver.findElement(By.name("tel")).sendKeys("0000-0000-0000");
		driver.findElement(By.name("inquiryContents")).clear();
		driver.findElement(By.name("inquiryContents")).sendKeys("お問い合わせ内容");
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