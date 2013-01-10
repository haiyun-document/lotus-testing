package cmsod.publish.site105.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DoutorInquiryFcFormTest {
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
	public void testDoutorInquiryFcFormTest() throws Exception {
		driver.get(baseUrl + "/inquiry/fc/index.html");
		driver.findElement(By.id("Q1_corporate")).click();
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("ドトール花子");
		driver.findElement(By.name("company")).clear();
		driver.findElement(By.name("company")).sendKeys("株式会社ドトールコーヒー");
		driver.findElement(By.name("department")).clear();
		driver.findElement(By.name("department")).sendKeys("店舗開発部");
		driver.findElement(By.name("activities")).clear();
		driver.findElement(By.name("activities")).sendKeys("主な事業内容");
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("105-8001");
		driver.findElement(By.name("address_1")).clear();
		driver.findElement(By.name("address_1")).sendKeys("東京都渋谷区神南一丁目10番1号");
		driver.findElement(By.name("address_2")).clear();
		driver.findElement(By.name("address_2")).sendKeys("ドトールビル2F");
		driver.findElement(By.name("tel")).clear();
		driver.findElement(By.name("tel")).sendKeys("03-5459-9008");
		driver.findElement(By.name("mobile_tel")).clear();
		driver.findElement(By.name("mobile_tel")).sendKeys("090-0000-XXXX");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("gmail@gmail.com");
		driver.findElement(By.id("Q4_new")).click();
		driver.findElement(By.id("Q4")).clear();
		driver.findElement(By.id("Q4")).sendKeys("cccccccccc");
		driver.findElement(By.xpath("(//input[@id='Q5_no'])[2]")).click();
		driver.findElement(By.id("Q5_no")).click();
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("東京都渋谷区神南一丁目10番1号 ドトールビル2F");
		driver.findElement(By.id("Q6_now_building")).click();
		driver.findElement(By.name("area")).clear();
		driver.findElement(By.name("area")).sendKeys("10");
		driver.findElement(By.name("feedback")).clear();
		driver.findElement(By.name("feedback")).sendKeys("ご意見・ご要望、ご質問等ございましたらご記入下さい。");
		driver.findElement(By.cssSelector("input.btn_agreenext")).click();
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