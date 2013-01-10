package cmsod.publish.site120.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MrcMrcpsInquiryFormTest {
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
	public void testMrcMrcpsInquiryFormTest() throws Exception {
		driver.get(baseUrl + "/mrcps/inquiry/index.html");
		driver.findElement(By.id("inquiry")).clear();
		driver.findElement(By.id("inquiry")).sendKeys("お問い合わせ・\nご連絡内容");
		driver.findElement(By.name("shubetsu")).click();
		driver.findElement(By.id("company")).clear();
		driver.findElement(By.id("company")).sendKeys("貴社名");
		driver.findElement(By.id("division")).clear();
		driver.findElement(By.id("division")).sendKeys("ご所属");
		driver.findElement(By.id("name1")).clear();
		driver.findElement(By.id("name1")).sendKeys("氏");
		driver.findElement(By.id("name2")).clear();
		driver.findElement(By.id("name2")).sendKeys("氏名");
		driver.findElement(By.id("name3")).clear();
		driver.findElement(By.id("name3")).sendKeys("ふり");
		driver.findElement(By.id("name4")).clear();
		driver.findElement(By.id("name4")).sendKeys("がな");
		driver.findElement(By.id("postal1")).clear();
		driver.findElement(By.id("postal1")).sendKeys("000");
		driver.findElement(By.id("postal2")).clear();
		driver.findElement(By.id("postal2")).sendKeys("0000");
		new Select(driver.findElement(By.name("todofuken"))).selectByVisibleText("秋田県");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("ご住所");
		driver.findElement(By.id("tel1")).clear();
		driver.findElement(By.id("tel1")).sendKeys("000");
		driver.findElement(By.id("tel2")).clear();
		driver.findElement(By.id("tel2")).sendKeys("0000");
		driver.findElement(By.id("tel3")).clear();
		driver.findElement(By.id("tel3")).sendKeys("0000");
		driver.findElement(By.id("fax1")).clear();
		driver.findElement(By.id("fax1")).sendKeys("000");
		driver.findElement(By.id("fax2")).clear();
		driver.findElement(By.id("fax2")).sendKeys("0000");
		driver.findElement(By.id("fax3")).clear();
		driver.findElement(By.id("fax3")).sendKeys("0000");
		driver.findElement(By.id("email1")).clear();
		driver.findElement(By.id("email1")).sendKeys("info@gmail.com");
		driver.findElement(By.id("email2")).clear();
		driver.findElement(By.id("email2")).sendKeys("info@gmail.com");
		// ERROR: Caught exception [ERROR: Unsupported command [chooseCancelOnNextConfirmation |  | ]]
		driver.findElement(By.id("send")).click();
		// ERROR: Caught exception [TypeError: can't access dead object]
		driver.findElement(By.id("send")).click();
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