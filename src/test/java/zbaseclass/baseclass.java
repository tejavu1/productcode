package zbaseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass  {





	
	public static WebDriver driver;
	
	
	

	//1
	public static WebDriver BrowserLaunch()  {

		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
	}
	//2
	public static void implicitWait(long sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	//3
	public static void urlLaunch(String url) {

		driver.get(url);
		driver.manage().window().maximize();
	}
	//4
	public static void getCurrentPageUrl() {

		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
	//5
	public static void getTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}
	//6
	public static void getText(WebElement element) {

		String a = element.getText();
		System.out.println(a);

	}

	//7
	public static void rightClick(WebElement element) {

		Actions a=new Actions(driver);

		a.contextClick().perform();


	}
	//8
	public static void moveTo(WebElement element) {

		Actions a=new Actions(driver);

		a.moveToElement(element).perform();		

	}
	//9
	public static void dragAndDrop(WebElement source, WebElement destination) {

		Actions a=new Actions(driver);

		a.dragAndDrop(source, destination).perform();
	}
	//10
	public static void doubleClick(WebElement target) {

		Actions a=new Actions(driver);

		a.doubleClick(target).perform();
	}
	//11
	public static void keyPress( ) throws AWTException  {

		Robot r=new Robot();


	}
	//12
	public static void simpleAlert() {

		Alert a=driver.switchTo().alert();

		a.accept();
	}
	//13
	public static void confirmAlertAccept() {

		Alert a=driver.switchTo().alert();

		a.accept();

	}
	//14
	public static void confirmAlertDismiss() {

		Alert a=driver.switchTo().alert();

		a.dismiss();

	}
	//15
	public static void promptAlertAccept(String value) {

		Alert a=driver.switchTo().alert();

		a.sendKeys(value);

		a.accept();
	}
	//16
	public static void promptAlertDismiss(String value) {

		Alert a=driver.switchTo().alert();

		a.sendKeys(value);

		a.dismiss();
	}
	//17
	public static void getAlertText() {

		Alert a=driver.switchTo().alert();

		a.getText();

		System.out.println(a.getText());

	}
	//18
	public static void fullScreenshot(String filedes) throws IOException {

		TakesScreenshot tk=(TakesScreenshot)driver; 

		File src = tk.getScreenshotAs(OutputType.FILE);

		File des=new File(filedes);

		FileUtils.copyFile(src, des);


	}
	//19
	public static void elementScreenshot(WebElement e,String filedes) throws IOException {

		TakesScreenshot tk=(TakesScreenshot)driver; 

		File src = e.getScreenshotAs(OutputType.FILE);

		File des=new File(filedes);

		FileUtils.copyFile(src, des);

	}
	//20
	public static void jsInsert(String input,WebElement e) {

		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','"+input+"')", e);

	}
	//21
	public static void jsClick(WebElement e) {

		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", e);
	}
	//22
	public static void jsGetAttribute(WebElement e) {

		JavascriptExecutor js=(JavascriptExecutor) driver;

		String op = (String)js.executeScript("return arguments[0].getAttribute('value')", e);

		System.out.println(op);
	}

	//23
	public static void jsScrollTrue(WebElement e) {

		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", e);


	}
	//24
	public static void jsScrollFalse(WebElement e) {

		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false)", e);


	}

	//25

	public static void selectByIndex(WebElement element,int index) {

		Select s=new Select(element);

		s.selectByIndex(index);

	}

	//26

	public static void selectByValue(WebElement element, String value) {

		Select s=new Select(element);

		s.selectByValue(value);
	}

	//27

	public static void selectByVisibleText(WebElement element, String text) {

		Select s=new Select(element);

		s.selectByVisibleText(text);
	}

	//28

	public static void isMultiple(WebElement element) {

		Select s=new Select(element);

		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	//29

	public static void getOption(WebElement element, int index) {

		Select s=new Select(element);

		List<WebElement> op = s.getOptions();

		WebElement w = op.get(index);

		String text = w.getText();
		System.out.println(text);

	}

	//30
	public static void getAllOptions(WebElement element) {
		Select s=new Select(element);

		List<WebElement> op = s.getOptions();

		for (int index=0;index<op.size();index++) {

			WebElement web1 = op.get(index);
			String printvalues = web1.getText();
			System.out.println(printvalues);

		}}

	///31	


	public static void deselectByIndex(WebElement element,int index) {

		Select s=new Select(element);

		s.deselectByIndex(index);

	}

	//32

	public static void deselectByValue(WebElement element, String value) {

		Select s=new Select(element);

		s.deselectByValue(value);
	}

	//33

	public static void deselectByVisibleText(WebElement element, String text) {

		Select s=new Select(element);

		s.deselectByVisibleText(text);
	}

	//34	

	public static void deselectAll(WebElement element) {

		Select s=new Select(element);

		s.deselectAll();
	}

	//35	

	public static void switchToFrame(int index) {

		driver.switchTo().frame(index);
	}

	//36	

	public static void switchToParentFrame() {

		driver.switchTo().parentFrame();
	}

	//37	

	public static void switchToDefaultContent() {

		driver.switchTo().defaultContent();
	}

	//38	

	public static void navigateTo(String url) {

		driver.navigate().to(url);
	}

	//39	

	public static void back() {

		driver.navigate().back();
	}

	//40

	public static void forward() {

		driver.navigate().forward();
	}

	//41

	public static void refresh() {

		driver.navigate().refresh();
	}

	//42

	public static void switchToWindow(int window) {

		Set<String> allid = driver.getWindowHandles();

		System.out.println(allid);

		List<String> li=new ArrayList<String>();

		li.addAll(allid);

		driver.switchTo().window(li.get(window));
	}

	//43

	public static void keyPress(int value) throws AWTException {

		Robot r=new Robot();

		r.keyPress(value);

	}

	//44

	public static void keyRelease(int value) throws AWTException {

		Robot r=new Robot();

		r.keyRelease(value);
	}

	//45

	public static void sendkeys(WebElement e, String text) {

//		e.sendKeys(text);
		e.sendKeys(text);
		

	}

	//46

	public static void click(WebElement e) {

		e.click();
//e.click
	}









}















