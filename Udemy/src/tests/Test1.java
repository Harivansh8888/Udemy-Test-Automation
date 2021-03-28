package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\firefoxdriver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://www.Udemy.com/");

	}

	static void giveInput(String id, String inputText, WebDriver driver) {
		WebElement inputTextBox = driver.findElement(By.id(id));
		inputTextBox.sendKeys(inputText);
	}

	static void clickById(String id, WebDriver driver) {
		WebElement button = driver.findElement(By.id(id));
		button.click();
	}
}

//This test will test the functionality of sign up 