package cmsod.publish.site120.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MrcInquiryProductsFormTest {
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
	public void testMrcInquiryProductsFormTest() throws Exception {
		driver.get(baseUrl + "/inquiry/products_form.html");
		new Select(driver.findElement(By.id("theme"))).selectByVisibleText("アクリル樹脂成形材料《アクリペット》");
		driver.findElement(By.name("subject")).clear();
		driver.findElement(By.name("subject")).sendKeys("件名");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("お名前");
		driver.findElement(By.name("kana")).clear();
		driver.findElement(By.name("kana")).sendKeys("フリガナ");
		driver.findElement(By.name("company")).clear();
		driver.findElement(By.name("company")).sendKeys("三菱レイヨン株式会社");
		driver.findElement(By.name("division")).clear();
		driver.findElement(By.name("division")).sendKeys("営業１部");
		driver.findElement(By.name("postal1")).clear();
		driver.findElement(By.name("postal1")).sendKeys("000");
		driver.findElement(By.name("postal2")).clear();
		driver.findElement(By.name("postal2")).sendKeys("0000");
		new Select(driver.findElement(By.name("pref"))).selectByVisibleText("秋田県");
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("千代田区丸の内１丁目１番１号");
		driver.findElement(By.name("tel")).clear();
		driver.findElement(By.name("tel")).sendKeys("00-0000-0000");
		driver.findElement(By.name("fax")).clear();
		driver.findElement(By.name("fax")).sendKeys("00-0000-0000");
		driver.findElement(By.name("email1")).clear();
		driver.findElement(By.name("email1")).sendKeys("email@mrc.co.jp");
		driver.findElement(By.name("email2")).clear();
		driver.findElement(By.name("email2")).sendKeys("email@mrc.co.jp");
		driver.findElement(By.name("message")).clear();
		driver.findElement(By.name("message")).sendKeys("お問い合わせ");
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