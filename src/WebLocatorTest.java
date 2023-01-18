import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

class WebLocatorTest {

	@Disabled
	void test_dummy1() throws InterruptedException {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
//			System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\geckodriver.exe");
//			driver = new FirefoxDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}


	@Disabled
	void test_dummy2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		
	@Disabled
	void testForm1_W1_C1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Disabled
	void testForm1_W1_C2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Disabled
	void testForm1_W1_C3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	


	
	@Disabled
	void testForm1_W2_C1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
	
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Disabled
	void testForm1_W2_C2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Disabled
	void testForm1_W2_C3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	
	
	@Disabled
	void testForm1_W3_C1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[11]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[21]")).click();
		driver.findElement(By.xpath("/html/body/form/input[21]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[22]")).click();
		driver.findElement(By.xpath("/html/body/form/input[22]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[23]")).click();
		driver.findElement(By.xpath("/html/body/form/input[23]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[24]")).click();
		driver.findElement(By.xpath("/html/body/form/input[24]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[25]")).click();
		driver.findElement(By.xpath("/html/body/form/input[25]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[26]")).click();
		driver.findElement(By.xpath("/html/body/form/input[26]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[27]")).click();
		driver.findElement(By.xpath("/html/body/form/input[27]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[28]")).click();
		driver.findElement(By.xpath("/html/body/form/input[28]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[29]")).click();
		driver.findElement(By.xpath("/html/body/form/input[29]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[30]")).click();
		driver.findElement(By.xpath("/html/body/form/input[30]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[31]")).click();
		driver.findElement(By.xpath("/html/body/form/input[31]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[32]")).click();
		driver.findElement(By.xpath("/html/body/form/input[32]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[33]")).click();
		driver.findElement(By.xpath("/html/body/form/input[33]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[34]")).click();
		driver.findElement(By.xpath("/html/body/form/input[34]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[35]")).click();
		driver.findElement(By.xpath("/html/body/form/input[35]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[36]")).click();
		driver.findElement(By.xpath("/html/body/form/input[36]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[37]")).click();
		driver.findElement(By.xpath("/html/body/form/input[37]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[38]")).click();
		driver.findElement(By.xpath("/html/body/form/input[38]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[39]")).click();
		driver.findElement(By.xpath("/html/body/form/input[39]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[40]")).click();
		driver.findElement(By.xpath("/html/body/form/input[40]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Disabled
	void testForm1_W3_C2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[11]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[21]")).click();
		driver.findElement(By.xpath("/html/body/form/input[21]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[22]")).click();
		driver.findElement(By.xpath("/html/body/form/input[22]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[23]")).click();
		driver.findElement(By.xpath("/html/body/form/input[23]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[24]")).click();
		driver.findElement(By.xpath("/html/body/form/input[24]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[25]")).click();
		driver.findElement(By.xpath("/html/body/form/input[25]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[26]")).click();
		driver.findElement(By.xpath("/html/body/form/input[26]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[27]")).click();
		driver.findElement(By.xpath("/html/body/form/input[27]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[28]")).click();
		driver.findElement(By.xpath("/html/body/form/input[28]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[29]")).click();
		driver.findElement(By.xpath("/html/body/form/input[29]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[30]")).click();
		driver.findElement(By.xpath("/html/body/form/input[30]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[31]")).click();
		driver.findElement(By.xpath("/html/body/form/input[31]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[32]")).click();
		driver.findElement(By.xpath("/html/body/form/input[32]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[33]")).click();
		driver.findElement(By.xpath("/html/body/form/input[33]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[34]")).click();
		driver.findElement(By.xpath("/html/body/form/input[34]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[35]")).click();
		driver.findElement(By.xpath("/html/body/form/input[35]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[36]")).click();
		driver.findElement(By.xpath("/html/body/form/input[36]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[37]")).click();
		driver.findElement(By.xpath("/html/body/form/input[37]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[38]")).click();
		driver.findElement(By.xpath("/html/body/form/input[38]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[39]")).click();
		driver.findElement(By.xpath("/html/body/form/input[39]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[40]")).click();
		driver.findElement(By.xpath("/html/body/form/input[40]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		

	@Disabled
	void testForm1_W3_C3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[11]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[21]")).click();
		driver.findElement(By.xpath("/html/body/form/input[21]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[22]")).click();
		driver.findElement(By.xpath("/html/body/form/input[22]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[23]")).click();
		driver.findElement(By.xpath("/html/body/form/input[23]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[24]")).click();
		driver.findElement(By.xpath("/html/body/form/input[24]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[25]")).click();
		driver.findElement(By.xpath("/html/body/form/input[25]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[26]")).click();
		driver.findElement(By.xpath("/html/body/form/input[26]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[27]")).click();
		driver.findElement(By.xpath("/html/body/form/input[27]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[28]")).click();
		driver.findElement(By.xpath("/html/body/form/input[28]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[29]")).click();
		driver.findElement(By.xpath("/html/body/form/input[29]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[30]")).click();
		driver.findElement(By.xpath("/html/body/form/input[30]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[31]")).click();
		driver.findElement(By.xpath("/html/body/form/input[31]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[32]")).click();
		driver.findElement(By.xpath("/html/body/form/input[32]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[33]")).click();
		driver.findElement(By.xpath("/html/body/form/input[33]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[34]")).click();
		driver.findElement(By.xpath("/html/body/form/input[34]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[35]")).click();
		driver.findElement(By.xpath("/html/body/form/input[35]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[36]")).click();
		driver.findElement(By.xpath("/html/body/form/input[36]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[37]")).click();
		driver.findElement(By.xpath("/html/body/form/input[37]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[38]")).click();
		driver.findElement(By.xpath("/html/body/form/input[38]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[39]")).click();
		driver.findElement(By.xpath("/html/body/form/input[39]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[40]")).click();
		driver.findElement(By.xpath("/html/body/form/input[40]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		
	
	@Disabled
	void testForm2_W1_C1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.id("checkbox4")).click();		
		driver.findElement(By.id("checkbox5")).click();
		driver.findElement(By.id("checkbox6")).click();
		driver.findElement(By.id("checkbox7")).click();
		driver.findElement(By.id("checkbox8")).click();
		driver.findElement(By.id("checkbox9")).click();
		driver.findElement(By.id("checkbox10")).click();
		
		WebElement radio1 = driver.findElement(By.id("radio1"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.id("radio2"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.id("radio3"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.id("radio4"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.id("radio5"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.id("radio6"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.id("radio7"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.id("radio8"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.id("radio9"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.id("radio10"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.id("option1")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.id("option2")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.id("option3")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.id("option4")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.id("option5")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.id("option6")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.id("option7")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.id("option8")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.id("option9")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.id("option10")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Disabled
	void testForm2_W1_C2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.id("checkbox4")).click();		
		driver.findElement(By.id("checkbox5")).click();
		driver.findElement(By.id("checkbox6")).click();
		driver.findElement(By.id("checkbox7")).click();
		driver.findElement(By.id("checkbox8")).click();
		driver.findElement(By.id("checkbox9")).click();
		driver.findElement(By.id("checkbox10")).click();
		
		WebElement radio1 = driver.findElement(By.id("radio1"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.id("radio2"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.id("radio3"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.id("radio4"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.id("radio5"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.id("radio6"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.id("radio7"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.id("radio8"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.id("radio9"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.id("radio10"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.id("option1")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.id("option2")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.id("option3")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.id("option4")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.id("option5")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.id("option6")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.id("option7")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.id("option8")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.id("option9")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.id("option10")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Disabled
	void testForm2_W1_C3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.id("checkbox4")).click();		
		driver.findElement(By.id("checkbox5")).click();
		driver.findElement(By.id("checkbox6")).click();
		driver.findElement(By.id("checkbox7")).click();
		driver.findElement(By.id("checkbox8")).click();
		driver.findElement(By.id("checkbox9")).click();
		driver.findElement(By.id("checkbox10")).click();
		
		WebElement radio1 = driver.findElement(By.id("radio1"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.id("radio2"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.id("radio3"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.id("radio4"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.id("radio5"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.id("radio6"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.id("radio7"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.id("radio8"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.id("radio9"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.id("radio10"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.id("option1")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.id("option2")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.id("option3")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.id("option4")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.id("option5")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.id("option6")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.id("option7")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.id("option8")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.id("option9")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.id("option10")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	
	
	@Disabled
	void testForm2_W2_C1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();

		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox10\"]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio1\"]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio2\"]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"radio3\"]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"radio4\"]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"radio5\"]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"radio6\"]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"radio7\"]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("//*[@id=\"radio8\"]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("//*[@id=\"radio9\"]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("//*[@id=\"radio10\"]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"option1\"]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("//*[@id=\"option2\"]")));
		option2.selectByVisibleText("value3");		
		Select option3 = new Select(driver.findElement(By.xpath("//*[@id=\"option3\"]")));
		option3.selectByVisibleText("value3");		
		Select option4 = new Select(driver.findElement(By.xpath("//*[@id=\"option4\"]")));
		option4.selectByVisibleText("value3");		
		Select option5 = new Select(driver.findElement(By.xpath("//*[@id=\"option5\"]")));
		option5.selectByVisibleText("value3");		
		Select option6 = new Select(driver.findElement(By.xpath("//*[@id=\"option6\"]")));
		option6.selectByVisibleText("value3");		
		Select option7 = new Select(driver.findElement(By.xpath("//*[@id=\"option7\"]")));
		option7.selectByVisibleText("value3");		
		Select option8 = new Select(driver.findElement(By.xpath("//*[@id=\"option8\"]")));
		option8.selectByVisibleText("value3");		
		Select option9 = new Select(driver.findElement(By.xpath("//*[@id=\"option9\"]")));
		option9.selectByVisibleText("value3");		
		Select option10 = new Select(driver.findElement(By.xpath("//*[@id=\"option10\"]")));
		option10.selectByVisibleText("value3");	
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Disabled
	void testForm2_W2_C2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox10\"]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio1\"]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio2\"]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"radio3\"]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"radio4\"]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"radio5\"]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"radio6\"]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"radio7\"]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("//*[@id=\"radio8\"]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("//*[@id=\"radio9\"]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("//*[@id=\"radio10\"]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"option1\"]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("//*[@id=\"option2\"]")));
		option2.selectByVisibleText("value3");		
		Select option3 = new Select(driver.findElement(By.xpath("//*[@id=\"option3\"]")));
		option3.selectByVisibleText("value3");		
		Select option4 = new Select(driver.findElement(By.xpath("//*[@id=\"option4\"]")));
		option4.selectByVisibleText("value3");		
		Select option5 = new Select(driver.findElement(By.xpath("//*[@id=\"option5\"]")));
		option5.selectByVisibleText("value3");		
		Select option6 = new Select(driver.findElement(By.xpath("//*[@id=\"option6\"]")));
		option6.selectByVisibleText("value3");		
		Select option7 = new Select(driver.findElement(By.xpath("//*[@id=\"option7\"]")));
		option7.selectByVisibleText("value3");		
		Select option8 = new Select(driver.findElement(By.xpath("//*[@id=\"option8\"]")));
		option8.selectByVisibleText("value3");		
		Select option9 = new Select(driver.findElement(By.xpath("//*[@id=\"option9\"]")));
		option9.selectByVisibleText("value3");		
		Select option10 = new Select(driver.findElement(By.xpath("//*[@id=\"option10\"]")));
		option10.selectByVisibleText("value3");	
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		

	@Disabled
	void testForm2_W2_C3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox10\"]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio1\"]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio2\"]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"radio3\"]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"radio4\"]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"radio5\"]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"radio6\"]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"radio7\"]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("//*[@id=\"radio8\"]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("//*[@id=\"radio9\"]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("//*[@id=\"radio10\"]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"option1\"]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("//*[@id=\"option2\"]")));
		option2.selectByVisibleText("value3");		
		Select option3 = new Select(driver.findElement(By.xpath("//*[@id=\"option3\"]")));
		option3.selectByVisibleText("value3");		
		Select option4 = new Select(driver.findElement(By.xpath("//*[@id=\"option4\"]")));
		option4.selectByVisibleText("value3");		
		Select option5 = new Select(driver.findElement(By.xpath("//*[@id=\"option5\"]")));
		option5.selectByVisibleText("value3");		
		Select option6 = new Select(driver.findElement(By.xpath("//*[@id=\"option6\"]")));
		option6.selectByVisibleText("value3");		
		Select option7 = new Select(driver.findElement(By.xpath("//*[@id=\"option7\"]")));
		option7.selectByVisibleText("value3");		
		Select option8 = new Select(driver.findElement(By.xpath("//*[@id=\"option8\"]")));
		option8.selectByVisibleText("value3");		
		Select option9 = new Select(driver.findElement(By.xpath("//*[@id=\"option9\"]")));
		option9.selectByVisibleText("value3");		
		Select option10 = new Select(driver.findElement(By.xpath("//*[@id=\"option10\"]")));
		option10.selectByVisibleText("value3");	
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}			
	
	@Disabled
	void testForm2_W3_C1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("/html/body/form/input[21]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("/html/body/form/input[22]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("/html/body/form/input[23]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("/html/body/form/input[24]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("/html/body/form/input[25]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("/html/body/form/input[26]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("/html/body/form/input[27]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("/html/body/form/input[28]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("/html/body/form/input[29]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("/html/body/form/input[30]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("/html/body/form/select[1]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("/html/body/form/select[2]")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.xpath("/html/body/form/select[3]")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.xpath("/html/body/form/select[4]")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.xpath("/html/body/form/select[5]")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.xpath("/html/body/form/select[6]")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.xpath("/html/body/form/select[7]")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.xpath("/html/body/form/select[8]")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.xpath("/html/body/form/select[9]")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.xpath("/html/body/form/select[10]")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Disabled
	void testForm2_W3_C2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("/html/body/form/input[21]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("/html/body/form/input[22]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("/html/body/form/input[23]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("/html/body/form/input[24]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("/html/body/form/input[25]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("/html/body/form/input[26]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("/html/body/form/input[27]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("/html/body/form/input[28]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("/html/body/form/input[29]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("/html/body/form/input[30]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("/html/body/form/select[1]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("/html/body/form/select[2]")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.xpath("/html/body/form/select[3]")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.xpath("/html/body/form/select[4]")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.xpath("/html/body/form/select[5]")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.xpath("/html/body/form/select[6]")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.xpath("/html/body/form/select[7]")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.xpath("/html/body/form/select[8]")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.xpath("/html/body/form/select[9]")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.xpath("/html/body/form/select[10]")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Disabled
	void testForm2_W3_C3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("/html/body/form/input[21]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("/html/body/form/input[22]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("/html/body/form/input[23]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("/html/body/form/input[24]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("/html/body/form/input[25]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("/html/body/form/input[26]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("/html/body/form/input[27]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("/html/body/form/input[28]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("/html/body/form/input[29]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("/html/body/form/input[30]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("/html/body/form/select[1]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("/html/body/form/select[2]")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.xpath("/html/body/form/select[3]")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.xpath("/html/body/form/select[4]")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.xpath("/html/body/form/select[5]")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.xpath("/html/body/form/select[6]")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.xpath("/html/body/form/select[7]")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.xpath("/html/body/form/select[8]")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.xpath("/html/body/form/select[9]")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.xpath("/html/body/form/select[10]")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}			
	
	@Test
	void test_dummy3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Test
	void test_dummy4() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		
	@Test
	void testForm1_W1_E1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Test
	void testForm1_W1_E2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Test
	void testForm1_W1_E3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
			
		driver.findElement(By.id("text11")).click();
		driver.findElement(By.id("text11")).sendKeys("TNIAC");
		driver.findElement(By.id("text12")).click();
		driver.findElement(By.id("text12")).sendKeys("TNIAC");
		driver.findElement(By.id("text13")).click();
		driver.findElement(By.id("text13")).sendKeys("TNIAC");
		driver.findElement(By.id("text14")).click();
		driver.findElement(By.id("text14")).sendKeys("TNIAC");
		driver.findElement(By.id("text15")).click();
		driver.findElement(By.id("text15")).sendKeys("TNIAC");
		driver.findElement(By.id("text16")).click();
		driver.findElement(By.id("text16")).sendKeys("TNIAC");
		driver.findElement(By.id("text17")).click();
		driver.findElement(By.id("text17")).sendKeys("TNIAC");
		driver.findElement(By.id("text18")).click();
		driver.findElement(By.id("text18")).sendKeys("TNIAC");	
		driver.findElement(By.id("text19")).click();
		driver.findElement(By.id("text19")).sendKeys("TNIAC");	
		driver.findElement(By.id("text20")).click();
		driver.findElement(By.id("text20")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text21")).click();
		driver.findElement(By.id("text21")).sendKeys("TNIAC");
		driver.findElement(By.id("text22")).click();
		driver.findElement(By.id("text22")).sendKeys("TNIAC");
		driver.findElement(By.id("text23")).click();
		driver.findElement(By.id("text23")).sendKeys("TNIAC");
		driver.findElement(By.id("text24")).click();
		driver.findElement(By.id("text24")).sendKeys("TNIAC");
		driver.findElement(By.id("text25")).click();
		driver.findElement(By.id("text25")).sendKeys("TNIAC");
		driver.findElement(By.id("text26")).click();
		driver.findElement(By.id("text26")).sendKeys("TNIAC");
		driver.findElement(By.id("text27")).click();
		driver.findElement(By.id("text27")).sendKeys("TNIAC");
		driver.findElement(By.id("text28")).click();
		driver.findElement(By.id("text28")).sendKeys("TNIAC");	
		driver.findElement(By.id("text29")).click();
		driver.findElement(By.id("text29")).sendKeys("TNIAC");	
		driver.findElement(By.id("text30")).click();
		driver.findElement(By.id("text30")).sendKeys("TNIAC");	
		
		driver.findElement(By.id("text31")).click();
		driver.findElement(By.id("text31")).sendKeys("TNIAC");
		driver.findElement(By.id("text32")).click();
		driver.findElement(By.id("text32")).sendKeys("TNIAC");
		driver.findElement(By.id("text33")).click();
		driver.findElement(By.id("text33")).sendKeys("TNIAC");
		driver.findElement(By.id("text34")).click();
		driver.findElement(By.id("text34")).sendKeys("TNIAC");
		driver.findElement(By.id("text35")).click();
		driver.findElement(By.id("text35")).sendKeys("TNIAC");
		driver.findElement(By.id("text36")).click();
		driver.findElement(By.id("text36")).sendKeys("TNIAC");
		driver.findElement(By.id("text37")).click();
		driver.findElement(By.id("text37")).sendKeys("TNIAC");
		driver.findElement(By.id("text38")).click();
		driver.findElement(By.id("text38")).sendKeys("TNIAC");	
		driver.findElement(By.id("text39")).click();
		driver.findElement(By.id("text39")).sendKeys("TNIAC");	
		driver.findElement(By.id("text40")).click();
		driver.findElement(By.id("text40")).sendKeys("TNIAC");	
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	


	
	@Test
	void testForm1_W2_E1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Test
	void testForm1_W2_E2() throws InterruptedException {
		WebDriver driver = null;


			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Test
	void testForm1_W2_E3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text11\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text12\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text13\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text14\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text15\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text16\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text17\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text18\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text19\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text20\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text21\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text22\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text23\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text24\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text25\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text26\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text27\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text28\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text29\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text30\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text31\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text32\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text33\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text34\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text35\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text36\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text37\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text38\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text39\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text40\"]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	
	
	@Test
	void testForm1_W3_E1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[11]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[21]")).click();
		driver.findElement(By.xpath("/html/body/form/input[21]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[22]")).click();
		driver.findElement(By.xpath("/html/body/form/input[22]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[23]")).click();
		driver.findElement(By.xpath("/html/body/form/input[23]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[24]")).click();
		driver.findElement(By.xpath("/html/body/form/input[24]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[25]")).click();
		driver.findElement(By.xpath("/html/body/form/input[25]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[26]")).click();
		driver.findElement(By.xpath("/html/body/form/input[26]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[27]")).click();
		driver.findElement(By.xpath("/html/body/form/input[27]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[28]")).click();
		driver.findElement(By.xpath("/html/body/form/input[28]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[29]")).click();
		driver.findElement(By.xpath("/html/body/form/input[29]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[30]")).click();
		driver.findElement(By.xpath("/html/body/form/input[30]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[31]")).click();
		driver.findElement(By.xpath("/html/body/form/input[31]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[32]")).click();
		driver.findElement(By.xpath("/html/body/form/input[32]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[33]")).click();
		driver.findElement(By.xpath("/html/body/form/input[33]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[34]")).click();
		driver.findElement(By.xpath("/html/body/form/input[34]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[35]")).click();
		driver.findElement(By.xpath("/html/body/form/input[35]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[36]")).click();
		driver.findElement(By.xpath("/html/body/form/input[36]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[37]")).click();
		driver.findElement(By.xpath("/html/body/form/input[37]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[38]")).click();
		driver.findElement(By.xpath("/html/body/form/input[38]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[39]")).click();
		driver.findElement(By.xpath("/html/body/form/input[39]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[40]")).click();
		driver.findElement(By.xpath("/html/body/form/input[40]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Test
	void testForm1_W3_E2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[11]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[21]")).click();
		driver.findElement(By.xpath("/html/body/form/input[21]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[22]")).click();
		driver.findElement(By.xpath("/html/body/form/input[22]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[23]")).click();
		driver.findElement(By.xpath("/html/body/form/input[23]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[24]")).click();
		driver.findElement(By.xpath("/html/body/form/input[24]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[25]")).click();
		driver.findElement(By.xpath("/html/body/form/input[25]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[26]")).click();
		driver.findElement(By.xpath("/html/body/form/input[26]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[27]")).click();
		driver.findElement(By.xpath("/html/body/form/input[27]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[28]")).click();
		driver.findElement(By.xpath("/html/body/form/input[28]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[29]")).click();
		driver.findElement(By.xpath("/html/body/form/input[29]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[30]")).click();
		driver.findElement(By.xpath("/html/body/form/input[30]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[31]")).click();
		driver.findElement(By.xpath("/html/body/form/input[31]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[32]")).click();
		driver.findElement(By.xpath("/html/body/form/input[32]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[33]")).click();
		driver.findElement(By.xpath("/html/body/form/input[33]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[34]")).click();
		driver.findElement(By.xpath("/html/body/form/input[34]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[35]")).click();
		driver.findElement(By.xpath("/html/body/form/input[35]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[36]")).click();
		driver.findElement(By.xpath("/html/body/form/input[36]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[37]")).click();
		driver.findElement(By.xpath("/html/body/form/input[37]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[38]")).click();
		driver.findElement(By.xpath("/html/body/form/input[38]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[39]")).click();
		driver.findElement(By.xpath("/html/body/form/input[39]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[40]")).click();
		driver.findElement(By.xpath("/html/body/form/input[40]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		

	@Test
	void testForm1_W3_E3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[11]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[21]")).click();
		driver.findElement(By.xpath("/html/body/form/input[21]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[22]")).click();
		driver.findElement(By.xpath("/html/body/form/input[22]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[23]")).click();
		driver.findElement(By.xpath("/html/body/form/input[23]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[24]")).click();
		driver.findElement(By.xpath("/html/body/form/input[24]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[25]")).click();
		driver.findElement(By.xpath("/html/body/form/input[25]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[26]")).click();
		driver.findElement(By.xpath("/html/body/form/input[26]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[27]")).click();
		driver.findElement(By.xpath("/html/body/form/input[27]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[28]")).click();
		driver.findElement(By.xpath("/html/body/form/input[28]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[29]")).click();
		driver.findElement(By.xpath("/html/body/form/input[29]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[30]")).click();
		driver.findElement(By.xpath("/html/body/form/input[30]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[31]")).click();
		driver.findElement(By.xpath("/html/body/form/input[31]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[32]")).click();
		driver.findElement(By.xpath("/html/body/form/input[32]")).sendKeys("TNIAC");	
		driver.findElement(By.xpath("/html/body/form/input[33]")).click();
		driver.findElement(By.xpath("/html/body/form/input[33]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[34]")).click();
		driver.findElement(By.xpath("/html/body/form/input[34]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[35]")).click();
		driver.findElement(By.xpath("/html/body/form/input[35]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[36]")).click();
		driver.findElement(By.xpath("/html/body/form/input[36]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[37]")).click();
		driver.findElement(By.xpath("/html/body/form/input[37]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[38]")).click();
		driver.findElement(By.xpath("/html/body/form/input[38]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[39]")).click();
		driver.findElement(By.xpath("/html/body/form/input[39]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[40]")).click();
		driver.findElement(By.xpath("/html/body/form/input[40]")).sendKeys("TNIAC");
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		
	
	@Test
	void testForm2_W1_E1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.id("checkbox4")).click();		
		driver.findElement(By.id("checkbox5")).click();
		driver.findElement(By.id("checkbox6")).click();
		driver.findElement(By.id("checkbox7")).click();
		driver.findElement(By.id("checkbox8")).click();
		driver.findElement(By.id("checkbox9")).click();
		driver.findElement(By.id("checkbox10")).click();
		
		WebElement radio1 = driver.findElement(By.id("radio1"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.id("radio2"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.id("radio3"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.id("radio4"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.id("radio5"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.id("radio6"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.id("radio7"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.id("radio8"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.id("radio9"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.id("radio10"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.id("option1")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.id("option2")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.id("option3")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.id("option4")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.id("option5")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.id("option6")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.id("option7")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.id("option8")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.id("option9")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.id("option10")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Test
	void testForm2_W1_E2() throws InterruptedException {
		WebDriver driver = null;
	
			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.id("checkbox4")).click();		
		driver.findElement(By.id("checkbox5")).click();
		driver.findElement(By.id("checkbox6")).click();
		driver.findElement(By.id("checkbox7")).click();
		driver.findElement(By.id("checkbox8")).click();
		driver.findElement(By.id("checkbox9")).click();
		driver.findElement(By.id("checkbox10")).click();
		
		WebElement radio1 = driver.findElement(By.id("radio1"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.id("radio2"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.id("radio3"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.id("radio4"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.id("radio5"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.id("radio6"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.id("radio7"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.id("radio8"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.id("radio9"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.id("radio10"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.id("option1")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.id("option2")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.id("option3")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.id("option4")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.id("option5")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.id("option6")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.id("option7")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.id("option8")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.id("option9")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.id("option10")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Test
	void testForm2_W1_E3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.id("text1")).click();
		driver.findElement(By.id("text1")).sendKeys("TNIAC");
		driver.findElement(By.id("text2")).click();
		driver.findElement(By.id("text2")).sendKeys("TNIAC");
		driver.findElement(By.id("text3")).click();
		driver.findElement(By.id("text3")).sendKeys("TNIAC");
		driver.findElement(By.id("text4")).click();
		driver.findElement(By.id("text4")).sendKeys("TNIAC");
		driver.findElement(By.id("text5")).click();
		driver.findElement(By.id("text5")).sendKeys("TNIAC");
		driver.findElement(By.id("text6")).click();
		driver.findElement(By.id("text6")).sendKeys("TNIAC");
		driver.findElement(By.id("text7")).click();
		driver.findElement(By.id("text7")).sendKeys("TNIAC");
		driver.findElement(By.id("text8")).click();
		driver.findElement(By.id("text8")).sendKeys("TNIAC");
		driver.findElement(By.id("text9")).click();
		driver.findElement(By.id("text9")).sendKeys("TNIAC");
		driver.findElement(By.id("text10")).click();
		driver.findElement(By.id("text10")).sendKeys("TNIAC");
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.id("checkbox4")).click();		
		driver.findElement(By.id("checkbox5")).click();
		driver.findElement(By.id("checkbox6")).click();
		driver.findElement(By.id("checkbox7")).click();
		driver.findElement(By.id("checkbox8")).click();
		driver.findElement(By.id("checkbox9")).click();
		driver.findElement(By.id("checkbox10")).click();
		
		WebElement radio1 = driver.findElement(By.id("radio1"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.id("radio2"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.id("radio3"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.id("radio4"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.id("radio5"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.id("radio6"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.id("radio7"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.id("radio8"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.id("radio9"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.id("radio10"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.id("option1")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.id("option2")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.id("option3")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.id("option4")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.id("option5")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.id("option6")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.id("option7")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.id("option8")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.id("option9")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.id("option10")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	
	
	@Test
	void testForm2_W2_E1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox10\"]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio1\"]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio2\"]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"radio3\"]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"radio4\"]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"radio5\"]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"radio6\"]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"radio7\"]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("//*[@id=\"radio8\"]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("//*[@id=\"radio9\"]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("//*[@id=\"radio10\"]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"option1\"]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("//*[@id=\"option2\"]")));
		option2.selectByVisibleText("value3");		
		Select option3 = new Select(driver.findElement(By.xpath("//*[@id=\"option3\"]")));
		option3.selectByVisibleText("value3");		
		Select option4 = new Select(driver.findElement(By.xpath("//*[@id=\"option4\"]")));
		option4.selectByVisibleText("value3");		
		Select option5 = new Select(driver.findElement(By.xpath("//*[@id=\"option5\"]")));
		option5.selectByVisibleText("value3");		
		Select option6 = new Select(driver.findElement(By.xpath("//*[@id=\"option6\"]")));
		option6.selectByVisibleText("value3");		
		Select option7 = new Select(driver.findElement(By.xpath("//*[@id=\"option7\"]")));
		option7.selectByVisibleText("value3");		
		Select option8 = new Select(driver.findElement(By.xpath("//*[@id=\"option8\"]")));
		option8.selectByVisibleText("value3");		
		Select option9 = new Select(driver.findElement(By.xpath("//*[@id=\"option9\"]")));
		option9.selectByVisibleText("value3");		
		Select option10 = new Select(driver.findElement(By.xpath("//*[@id=\"option10\"]")));
		option10.selectByVisibleText("value3");	
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}	

	@Test
	void testForm2_W2_E2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox10\"]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio1\"]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio2\"]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"radio3\"]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"radio4\"]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"radio5\"]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"radio6\"]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"radio7\"]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("//*[@id=\"radio8\"]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("//*[@id=\"radio9\"]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("//*[@id=\"radio10\"]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"option1\"]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("//*[@id=\"option2\"]")));
		option2.selectByVisibleText("value3");		
		Select option3 = new Select(driver.findElement(By.xpath("//*[@id=\"option3\"]")));
		option3.selectByVisibleText("value3");		
		Select option4 = new Select(driver.findElement(By.xpath("//*[@id=\"option4\"]")));
		option4.selectByVisibleText("value3");		
		Select option5 = new Select(driver.findElement(By.xpath("//*[@id=\"option5\"]")));
		option5.selectByVisibleText("value3");		
		Select option6 = new Select(driver.findElement(By.xpath("//*[@id=\"option6\"]")));
		option6.selectByVisibleText("value3");		
		Select option7 = new Select(driver.findElement(By.xpath("//*[@id=\"option7\"]")));
		option7.selectByVisibleText("value3");		
		Select option8 = new Select(driver.findElement(By.xpath("//*[@id=\"option8\"]")));
		option8.selectByVisibleText("value3");		
		Select option9 = new Select(driver.findElement(By.xpath("//*[@id=\"option9\"]")));
		option9.selectByVisibleText("value3");		
		Select option10 = new Select(driver.findElement(By.xpath("//*[@id=\"option10\"]")));
		option10.selectByVisibleText("value3");	
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		

	@Test
	void testForm2_W2_E3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text3\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text4\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text5\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text6\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text7\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text8\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text9\"]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"text10\"]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox10\"]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio1\"]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio2\"]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"radio3\"]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"radio4\"]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"radio5\"]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("//*[@id=\"radio6\"]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"radio7\"]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("//*[@id=\"radio8\"]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("//*[@id=\"radio9\"]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("//*[@id=\"radio10\"]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"option1\"]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("//*[@id=\"option2\"]")));
		option2.selectByVisibleText("value3");		
		Select option3 = new Select(driver.findElement(By.xpath("//*[@id=\"option3\"]")));
		option3.selectByVisibleText("value3");		
		Select option4 = new Select(driver.findElement(By.xpath("//*[@id=\"option4\"]")));
		option4.selectByVisibleText("value3");		
		Select option5 = new Select(driver.findElement(By.xpath("//*[@id=\"option5\"]")));
		option5.selectByVisibleText("value3");		
		Select option6 = new Select(driver.findElement(By.xpath("//*[@id=\"option6\"]")));
		option6.selectByVisibleText("value3");		
		Select option7 = new Select(driver.findElement(By.xpath("//*[@id=\"option7\"]")));
		option7.selectByVisibleText("value3");		
		Select option8 = new Select(driver.findElement(By.xpath("//*[@id=\"option8\"]")));
		option8.selectByVisibleText("value3");		
		Select option9 = new Select(driver.findElement(By.xpath("//*[@id=\"option9\"]")));
		option9.selectByVisibleText("value3");		
		Select option10 = new Select(driver.findElement(By.xpath("//*[@id=\"option10\"]")));
		option10.selectByVisibleText("value3");	
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		
	
	@Test
	void testForm2_W3_E1() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("/html/body/form/input[21]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("/html/body/form/input[22]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("/html/body/form/input[23]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("/html/body/form/input[24]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("/html/body/form/input[25]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("/html/body/form/input[26]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("/html/body/form/input[27]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("/html/body/form/input[28]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("/html/body/form/input[29]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("/html/body/form/input[30]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("/html/body/form/select[1]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("/html/body/form/select[2]")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.xpath("/html/body/form/select[3]")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.xpath("/html/body/form/select[4]")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.xpath("/html/body/form/select[5]")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.xpath("/html/body/form/select[6]")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.xpath("/html/body/form/select[7]")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.xpath("/html/body/form/select[8]")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.xpath("/html/body/form/select[9]")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.xpath("/html/body/form/select[10]")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Test
	void testForm2_W3_E2() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("/html/body/form/input[21]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("/html/body/form/input[22]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("/html/body/form/input[23]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("/html/body/form/input[24]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("/html/body/form/input[25]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("/html/body/form/input[26]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("/html/body/form/input[27]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("/html/body/form/input[28]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("/html/body/form/input[29]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("/html/body/form/input[30]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("/html/body/form/select[1]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("/html/body/form/select[2]")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.xpath("/html/body/form/select[3]")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.xpath("/html/body/form/select[4]")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.xpath("/html/body/form/select[5]")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.xpath("/html/body/form/select[6]")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.xpath("/html/body/form/select[7]")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.xpath("/html/body/form/select[8]")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.xpath("/html/body/form/select[9]")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.xpath("/html/body/form/select[10]")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}

	@Test
	void testForm2_W3_E3() throws InterruptedException {
		WebDriver driver = null;

			System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form2.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/input[5]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[6]")).click();
		driver.findElement(By.xpath("/html/body/form/input[6]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/form/input[7]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[8]")).click();
		driver.findElement(By.xpath("/html/body/form/input[8]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[9]")).click();
		driver.findElement(By.xpath("/html/body/form/input[9]")).sendKeys("TNIAC");
		driver.findElement(By.xpath("/html/body/form/input[10]")).click();
		driver.findElement(By.xpath("/html/body/form/input[10]")).sendKeys("TNIAC");
		
		driver.findElement(By.xpath("/html/body/form/input[11]")).click();
		driver.findElement(By.xpath("/html/body/form/input[12]")).click();
		driver.findElement(By.xpath("/html/body/form/input[13]")).click();
		driver.findElement(By.xpath("/html/body/form/input[14]")).click();
		driver.findElement(By.xpath("/html/body/form/input[15]")).click();
		driver.findElement(By.xpath("/html/body/form/input[16]")).click();
		driver.findElement(By.xpath("/html/body/form/input[17]")).click();
		driver.findElement(By.xpath("/html/body/form/input[18]")).click();
		driver.findElement(By.xpath("/html/body/form/input[19]")).click();
		driver.findElement(By.xpath("/html/body/form/input[20]")).click();
		
		WebElement radio1 = driver.findElement(By.xpath("/html/body/form/input[21]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("/html/body/form/input[22]"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.xpath("/html/body/form/input[23]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("/html/body/form/input[24]"));
		radio4.click();
		WebElement radio5 = driver.findElement(By.xpath("/html/body/form/input[25]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("/html/body/form/input[26]"));
		radio6.click();
		WebElement radio7 = driver.findElement(By.xpath("/html/body/form/input[27]"));
		radio7.click();
		WebElement radio8 = driver.findElement(By.xpath("/html/body/form/input[28]"));
		radio8.click();
		WebElement radio9 = driver.findElement(By.xpath("/html/body/form/input[29]"));
		radio9.click();
		WebElement radio10 = driver.findElement(By.xpath("/html/body/form/input[30]"));
		radio10.click();
		
		Select option1 = new Select(driver.findElement(By.xpath("/html/body/form/select[1]")));
		option1.selectByVisibleText("value3");
		Select option2 = new Select(driver.findElement(By.xpath("/html/body/form/select[2]")));
		option2.selectByVisibleText("value3");
		Select option3 = new Select(driver.findElement(By.xpath("/html/body/form/select[3]")));
		option3.selectByVisibleText("value3");
		Select option4 = new Select(driver.findElement(By.xpath("/html/body/form/select[4]")));
		option4.selectByVisibleText("value3");
		Select option5 = new Select(driver.findElement(By.xpath("/html/body/form/select[5]")));
		option5.selectByVisibleText("value3");
		Select option6 = new Select(driver.findElement(By.xpath("/html/body/form/select[6]")));
		option6.selectByVisibleText("value3");
		Select option7 = new Select(driver.findElement(By.xpath("/html/body/form/select[7]")));
		option7.selectByVisibleText("value3");
		Select option8 = new Select(driver.findElement(By.xpath("/html/body/form/select[8]")));
		option8.selectByVisibleText("value3");
		Select option9 = new Select(driver.findElement(By.xpath("/html/body/form/select[9]")));
		option9.selectByVisibleText("value3");
		Select option10 = new Select(driver.findElement(By.xpath("/html/body/form/select[10]")));
		option10.selectByVisibleText("value3");
		
//		System.out.println(browser+" is running");
//		System.out.println("" + driver.getTitle());
		
		//Thread.sleep(4000);
        driver.quit();
        driver = null;
//		System.out.println("Finish !!!");
		
	}		
}
