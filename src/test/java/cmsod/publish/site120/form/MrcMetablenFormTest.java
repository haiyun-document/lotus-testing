//package cmsod.publish.site120.form;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.concurrent.TimeUnit;
//
//import static org.junit.Assert.fail;
//
//public class MrcMetablenFormTest {
//	private WebDriver driver;
//	private String baseUrl;
//	private StringBuffer verificationErrors = new StringBuffer();
//	@Before
//	public void setUp() throws Exception {
//		driver = new FirefoxDriver();
//
//		baseUrl = "https://testform.connecty.co.jp";
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//
//	@Test
//	public void testConnectyFormWebDriver() throws Exception {
//		driver.get(baseUrl + "/inquiry/input");
//		new Select(driver.findElement(By.name("inquiryType"))).selectByVisibleText("「CMS on Demand」の製品問合せ・資料請求");
//		driver.findElement(By.name("corporateName")).clear();
//		driver.findElement(By.name("corporateName")).sendKeys("御社名");
//		driver.findElement(By.name("senderName")).clear();
//		driver.findElement(By.name("senderName")).sendKeys("ご担当者名：");
//		driver.findElement(By.name("tel")).clear();
//		driver.findElement(By.name("tel")).sendKeys("00000");
//		driver.findElement(By.name("mailaddress")).clear();
//		driver.findElement(By.name("mailaddress")).sendKeys("info@gmail.com");
//		driver.findElement(By.id("description")).clear();
//		driver.findElement(By.id("description")).sendKeys("お問い合わせ内容：");
//		driver.findElement(By.name("reply")).click();
//		driver.findElement(By.name("confirm")).click();
//		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		driver.quit();
//		String verificationErrorString = verificationErrors.toString();
//		if (!"".equals(verificationErrorString)) {
//			fail(verificationErrorString);
//		}
//	}
//
//	private boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
//}
