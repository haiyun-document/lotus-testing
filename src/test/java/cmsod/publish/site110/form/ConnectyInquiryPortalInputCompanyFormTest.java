package cmsod.publish.site110.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ConnectyInquiryPortalInputCompanyFormTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://testform.connecty.co.jp";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testConnectyInquiryPortalInputCompanyFormTest() throws Exception {
		driver.get(baseUrl + "/inquiry/portal/input");
		driver.findElement(By.name("corporateName")).clear();
		driver.findElement(By.name("corporateName")).sendKeys("御社名");
		driver.findElement(By.name("senderName")).clear();
		driver.findElement(By.name("senderName")).sendKeys("ご担当者名");
		driver.findElement(By.name("tel")).clear();
		driver.findElement(By.name("tel")).sendKeys("000-0000-000");
		driver.findElement(By.name("mailaddress")).clear();
		driver.findElement(By.name("mailaddress")).sendKeys("gmail@gmail.com");
		new Select(driver.findElement(By.name("inquiryType"))).selectByVisibleText("自社での利用を検討したい");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("お問い合わせ内容");
		driver.findElement(By.name("reply")).click();
		driver.findElement(By.cssSelector("input.btn2")).click();
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
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