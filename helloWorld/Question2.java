package helloWorld;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question2 {
	WebDriver driver;
	String baseURL;
	
	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanjay\\Documents\\driver\\chromedriver.exe\\");
		driver = new ChromeDriver();
		baseURL = "https://www.weightwatchers.com/us/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void verifyQuestion2() {
		// Navigate to baseURL
		driver.get(baseURL);
		
		//Get the tiltle of Main Page
		
		String my_title = driver.getTitle();
		
		System.out.println(my_title);
				
		String expected_title = "Weight Loss Program, Recipes & Help | Weight Watchers";
		//verification of title
		Assert.assertEquals(my_title, expected_title);
		
		
		// Click Find a meeting link
		driver.findElement(By.linkText("Find a Meeting")).click();
		String meeting_title = driver.getTitle();
			
		System.out.println(meeting_title);
		
		String expected_meetingtitle = "Get Schedules & Times Near You";
		//verification of titles
		Assert.assertTrue(meeting_title.contains("Get Schedules & Times Near You"));
		
		// Search for zip code
		
		driver.findElement(By.id("meetingSearch")).sendKeys("10011");
		driver.findElement(By.xpath("//input[@id='meetingSearch']//following::button[1]")).click();
		// Find 1st title
		String title = driver.findElement(By.xpath("(//div[@class='location__name'])[1]")).getText();
				
		System.out.println("First Title: " + title);
		// Find distance of the 1st title
		String distance = driver.findElement(By.xpath("(//div[@class='location__distance'])[1]")).getText();
		System.out.println("Distance: " + distance);
		// Click the title
		WebElement titleToClick = driver.findElement(
				By.xpath("//a[@href='/us/find-a-meeting/1180510/weight-watchers-store-23rd-st-5th-ave-new-york-ny']"));
		titleToClick.click();
		String titleAfterClick = driver.findElement(By.xpath("//div[@class='location__name']/span")).getText();
		// Verification of both titles
		Assert.assertEquals(title, titleAfterClick);
				
		// Find today's hours
		String hours = driver.findElement(By.xpath("//div[contains(@class,'hours-list--currentday')]/div/div")).getText();
		System.out.println("Hours: " + hours);
	}
}


	
	
	


