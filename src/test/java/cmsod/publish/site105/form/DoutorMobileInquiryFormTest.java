package cmsod.publish.site105.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DoutorMobileInquiryFormTest {
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
	public void testDoutorMobileInquiryFormTest() throws Exception {
		driver.get(baseUrl + "/mobile/inquiry/index.html?brand=%e3%83%89%e3%83%88%e3%83%bc%e3%83%ab%e3%82%b3%e3%83%bc%e3%83%92%e3%83%bc%e3%82%b7%e3%83%a7%e3%83%83%e3%83%97");
		new Select(driver.findElement(By.name("brand"))).selectByVisibleText("カフェ コロラド");
		driver.findElement(By.name("route")).clear();
		driver.findElement(By.name("route")).sendKeys("店名・商品名");
		driver.findElement(By.name("feedback")).clear();
		driver.findElement(By.name("feedback")).sendKeys("ご意見・ご感想等お聞かせ下さい");
		driver.findElement(By.name("knjname")).clear();
		driver.findElement(By.name("knjname")).sendKeys("漢字");
		driver.findElement(By.name("kananame")).clear();
		driver.findElement(By.name("kananame")).sendKeys("ふりがな");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("gmail@gmail.com");
		driver.findElement(By.name("tel")).clear();
		driver.findElement(By.name("tel")).sendKeys("000-000-0000");
		driver.findElement(By.xpath("(//input[@name=''])[2]")).click();
		driver.findElement(By.xpath("//input[@value='送信する']")).click();
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