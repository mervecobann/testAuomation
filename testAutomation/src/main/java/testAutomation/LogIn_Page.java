package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {

	private static WebElement element = null;

	public static WebElement txtbx_UserName(WebDriver driver) {

		element = driver.findElement(By.xpath ("//*[@id=\"email\"]"));

		return element;

	}

	public static WebElement txtbx_Password(WebDriver driver) {

		//element = driver.findElement(By.xpath("//input[@id='password']"));
		element = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		return element;

	}

	public static WebElement btn_LogIn(WebDriver driver) {

		element = driver.findElement(By.linkText("Giriþ Yap"));

		return element;

	}

}