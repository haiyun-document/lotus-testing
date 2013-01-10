package cmsod.publish.site105.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DoutorInquiryDcsFormTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://testform.doutor.co.jp";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testDoutorInquiryDcsFormTest() throws Exception {
		driver.get(baseUrl + "/inquiry/dcs/index.html");
		driver.findElement(By.xpath("(//input[@name='theme'])[2]")).click();
		driver.findElement(By.name("route")).clear();
		driver.findElement(By.name("route")).sendKeys("店名もしくは店舗が特定できる周辺建造物など\nWEBページのURLもしくはページが特定できるクリック経路など");
		driver.findElement(By.name("feedback")).clear();
		driver.findElement(By.name("feedback")).sendKeys("お客さまのご意見・ご感想");
		driver.findElement(By.name("knjname")).clear();
		driver.findElement(By.name("knjname")).sendKeys("ドトール花子");
		driver.findElement(By.name("kananame")).clear();
		driver.findElement(By.name("kananame")).sendKeys("どとーるはなこ");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("gmail@gmail.com");
		driver.findElement(By.name("tel")).clear();
		driver.findElement(By.name("tel")).sendKeys("03-5459-9008");
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("東京都渋谷区神南一丁目10番1号 ドトールビル2F");
		driver.findElement(By.xpath("(//input[@value='同意して確認画面に進む'])[2]")).click();
		driver.findElement(By.cssSelector("input.btn_send")).click();
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