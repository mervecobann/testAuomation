package testAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class w {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.trendyol.com");
			driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[1]/a/span[2]")).click();
			Thread.sleep(3000);
			WebElement login = driver.findElement(By.id("accountBtn"));
			// login.click();

			Actions actions = new Actions(driver);

			actions.moveToElement(login).click().perform();
			Thread.sleep(3000);
//Thread.sleep(3000);

			// WebDriverWait wait = new WebDriverWait(driver, 10);

			// Wait for Alert to be present

			// Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());

			// new WebDriverWait(driver,
			// 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/div[11]/div/div/div")));
			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			LogIn_Page.txtbx_UserName(driver).sendKeys("exampleproject11@gmail.com");

			LogIn_Page.txtbx_Password(driver).sendKeys("1234Merve");

			LogIn_Page.btn_LogIn(driver).click();
			Thread.sleep(3000);
			// driver.findElement(By.xpath("//*[contains(@class,'fancybox-item
			// fancybox-close')]")).click();
			// Thread.sleep(3000);
			WebElement x = driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/input"));
			x.sendKeys("bilgisayar");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/i")).click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div/div[6]/div[1]/a/div[1]/div/img"))
					.click();
			Thread.sleep(3000);

			WebElement a = driver
					.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[3]/button[1]"));
			actions.moveToElement(a);
			a.click();

			Thread.sleep(3000);
			String fiyat=driver.findElement(By.xpath("			//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[3]/div[2]/span")).getText().toString();
			System.out.println(fiyat);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"myBasketListItem\"]/div[1]/a/i")).click();

			Thread.sleep(3000);
			
			String fiyat2=driver.findElement(By.xpath("//*[@id=\"partial-basket\"]/div/div[2]/div[2]/div[3]/div[2]")).getText().toString();
			System.out.println(fiyat2);
			if(fiyat==fiyat2) {
				System.out.println("Test Passed");
			}
			else {
				System.out.println("Test Failed");
			}
			// actions.moveToElement(login1).click().perform();
//driver.manage().timeouts().implicitly Wait(10, TimeUnit.SECONDS); 
			// WebElement login2 =
			/*
			 * driver.findElement( By.xpath(
			 * "//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[3]/button[1]/div[1]"
			 * )) .click(); // actions.moveToElement(login2).click().perform();
			 * Thread.sleep(3000);
			 */

			// WebDriverWait wait = new WebDriverWait(driver, 10);
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[1]/button[1]/div[1]")));
			// *[@id="product-detail-app"]/div/div[2]/div[2]/div[2]/div[1]/button[1]/div[1]

			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// WebElement login2= driver.findElement(
			// By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[1]/button[1]/div[1]"));
			// .click();
			// actions.moveToElement(login2).click().perform();
			// Thread.sleep(2000);
			// Actions actions = new Actions(driver);

			// *[@id="product-detail-app"]/div/div[2]/div[2]/div[2]/div[5]/button[1]/div[1]
			// *[@id="product-detail-app"]/div/div[2]/div[2]/div[2]/div[5]/button[1]/div[1]
			/*
			 * driver.findElement( By.xpath(
			 * "//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[5]/button[1]/div[1]"
			 * )) .click(); Thread.sleep(3000);
			 */
			// WebElement b =
			// driver.findElement(By.xpath("//*[contains(@class,'search-box')]"));
			// b.sendKeys("bilgisayar");
			// driver.findElement(By.xpath("//*[@id=\"smsPreference\"]")).click();
			// Thread.sleep(3000);

			// driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div[2]/div[2]/div[6]/div")).click();
			// Thread.sleep(3000);
			// driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div[1]/svg")).click();

			// *[@id="modal-root"]/div/div/div[2]/div[2]/div[6]/div
			// WebElement username = driver.findElement(By.id("email"));
			// username.sendKeys("example@gmail.com");
			/*
			 * WebElement password = driver.findElement(By.id("password")); WebElement
			 * login1 = driver.findElement(By.linkText("Giriþ Yap"));
			 * 
			 * password.sendKeys("password"); login1.click(); //String actualUrl =
			 * "https://www.linkedin.com/feed/"; String expectedUrl =
			 * driver.getCurrentUrl(); /* if (actualUrl.equalsIgnoreCase(expectedUrl)) {
			 * System.out.println("Test passed"); } else {
			 * System.out.println("Test failed");
			 * 
			 * }
			 */

		} catch (Exception e) {
			System.out.println("hata" + e);
		}
	}
}
