package cmsod.publish.site105.form;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DoutorMobileInquiryPaFormTest {
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
	public void testDoutorMobileInquiryPaFormTest() throws Exception {
		driver.get(baseUrl + "/mobile/inquiry/pa/index.html?tencode=05000097&hope=%E3%82%A8%E3%82%AF%E3%82%BB%E3%83%AB%E3%82%B7%E3%82%AA%E3%83%BC%E3%83%AB%20%E3%82%AB%E3%83%95%E3%82%A7%20%E5%BF%83%E6%96%8E%E6%A9%8B%E5%BA%97");
		driver.findElement(By.name("knjname")).clear();
		driver.findElement(By.name("knjname")).sendKeys("漢字");
		driver.findElement(By.name("kananame")).clear();
		driver.findElement(By.name("kananame")).sendKeys("ふりがな");
		driver.findElement(By.name("age")).clear();
		driver.findElement(By.name("age")).sendKeys("20");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.name("tel")).clear();
		driver.findElement(By.name("tel")).sendKeys("000-0000-0000");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("gmail@gmail.com");
		driver.findElement(By.xpath("(//input[@name='report_time'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='work_days'])[2]")).click();
		driver.findElement(By.name("work_time")).click();
		driver.findElement(By.name("feedback")).clear();
		driver.findElement(By.name("feedback")).sendKeys("ご意見・ご感想等お聞かせ下さい");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
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