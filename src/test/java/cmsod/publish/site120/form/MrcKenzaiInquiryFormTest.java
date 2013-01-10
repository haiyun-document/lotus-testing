package cmsod.publish.site120.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MrcKenzaiInquiryFormTest {
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
	public void testMrcKenzaiInquiryFormTest() throws Exception {
		driver.get(baseUrl + "/kenzai/inquiry/form.html");
		driver.findElement(By.name("product")).click();
		driver.findElement(By.xpath("(//input[@name='product'])[6]")).click();
		driver.findElement(By.xpath("(//input[@name='product'])[11]")).click();
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("お名前");
		driver.findElement(By.name("company")).clear();
		driver.findElement(By.name("company")).sendKeys("会社名");
		driver.findElement(By.name("postal1")).clear();
		driver.findElement(By.name("postal1")).sendKeys("000");
		driver.findElement(By.name("postal2")).clear();
		driver.findElement(By.name("postal2")).sendKeys("0000");
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("ご連絡先住所");
		driver.findElement(By.name("tel1")).clear();
		driver.findElement(By.name("tel1")).sendKeys("000");
		driver.findElement(By.name("tel2")).clear();
		driver.findElement(By.name("tel2")).sendKeys("0000");
		driver.findElement(By.name("tel3")).clear();
		driver.findElement(By.name("tel3")).sendKeys("0000");
		driver.findElement(By.name("email1")).clear();
		driver.findElement(By.name("email1")).sendKeys("info@gmail.com");
		driver.findElement(By.name("inquiry")).clear();
		driver.findElement(By.name("inquiry")).sendKeys("お問い合わせ内容");
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