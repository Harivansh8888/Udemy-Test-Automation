package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\firefoxdriver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to(
				"https://www.udemy.com/join/signup-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F%3Futm_source%3Dadwords-brand%26utm_medium%3Dudemyads%26utm_campaign%3DBrand-Udemy_la.EN_cc.INDIA%26utm_term%3D_._ag_78279294239_._ad_450776424635_._de_c_._dm__._pl__._ti_kwd-302329806175_._li_9302122_._pd__._%26utm_term%3D_._pd__._kw_udemy%2520login_._%26matchtype%3De%26gclid%3DCj0KCQjw0oCDBhCPARIsAII3C_FMYMB_5jLytP6aFKlwZkm_YhowZhIz-DBiIpTXcDjQ__T1kwguWpYaAjNOEALw_wcB");

		giveInput("id_fullname", "Harshil bhardwaj", driver);
		giveInput("email--1", "500068580@stu.upes.ac.in", driver);
		clickById("submit-id-submit", driver);
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