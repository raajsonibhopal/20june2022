package pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.BrowserMgr;
import utils.ReadPropertyFile;

public class ebay {
	public static WebDriver driver;
	public static WebElement element;
	public static List<WebElement> elements;
    private static String expected;
    private static String actual;
	public static void openURL(String browser) throws IOException {
		driver = BrowserMgr.setProperty(driver, ReadPropertyFile.readFileBrwoserProperty(browser));
		driver.get(ReadPropertyFile.readFileBaseURLProperty());
	}

	
	
	
	
	public static WebElement SearchBox(WebDriver driver) {
		String xPath = "//input[@id='gh-ac']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	public static void SearchingForPhone(String mail) {
		ebay.SearchBox(driver).sendKeys("phone");
	}
	
	
	public static WebElement ClickOnSavedBtn(WebDriver driver) {
		String xPath = "//a[text()='Saved']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnSaved(WebDriver string) {
		ebay.ClickOnSavedBtn(driver).click();
	}
	
	public static void backBtn(WebDriver string) {
		ebay.driver.navigate().back();
	}
	
	
	
	public static WebElement ClickOnElectronicsBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Electronics']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnElectronics(String mail) {
		ebay.ClickOnElectronicsBtn(driver).click();
	}
	
	
	

	public static WebElement ClickOnFashionBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Fashion']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnFashion(String mail) {
		ebay.ClickOnFashionBtn(driver).click();
	}
	
	
	
	
	public static WebElement ClickOnHealthBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Health & Beauty']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnHealth(String mail) {
		ebay.ClickOnHealthBtn(driver).click();
	}
	
	
	
	public static WebElement ClickOnHomeBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Home & Garden']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnHome(String mail) {
		ebay.ClickOnHomeBtn(driver).click();
	}
	
	
	
	public static WebElement ClickOnSportBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Sports']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnSports(String mail) {
		ebay.ClickOnHomeBtn(driver).click();
	}
	
	
	
	
	
	public static WebElement ClickOnCollectiblesBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Collectibles and Art']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnCollectibles(String mail) {
		ebay.ClickOnCollectiblesBtn(driver).click();
	}

	
	
	public static WebElement ClickOnIndustrialBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Industrial equipment']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnIndustrial(String mail) {
		ebay.ClickOnIndustrialBtn(driver).click();
	}
	
	
	
	public static WebElement ClickOnMotorsBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Motors']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnMotors(String mail) {
		ebay.ClickOnMotorsBtn(driver).click();
	}
	
	
	
	public static WebElement ClickOnDealsBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Deals']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnDeals(String mail) {
		ebay.ClickOnDealsBtn(driver).click();
	}
	
	
	public static WebElement ClickOnSellBtn(WebDriver driver) {
		String xPath = "//div[@id='mainContent']/div/ul/li/a[text()='Sell']";
		element = driver.findElement(By.xpath(xPath));
		return element;
	}
	
	
	public static void ClickingOnSell(String mail) {
		ebay.ClickOnSellBtn(driver).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//---------------------------------------------------------------------------------------
//	
//	


//
//	}

//	public static void acceptSimpleAlert() {
//		ebay.simpleAlert(driver).click();
//		driver.switchTo().alert().accept();
//	}
//
//	public static void dismissPrompt() {
//		ebay.dismssAlert(driver).click();
//		driver.switchTo().alert().dismiss();
//	}

	public static void moveToElem() {
		Actions action = new Actions(driver);
		action.moveToElement(ebay.mouseOverTo(driver)).perform();
	}

	public static void refreshBrowser() {
		ebay.driver.navigate().refresh();
		ebay.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 ebay.driver.close();
	}
	public static void confirmCorrectUrl() {
		expected="Electronics, Cars, Fashion, Collectibles & More | eBay";
		actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
		System.out.println("On correct page");
		
	}

}
