package week4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createArticle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://dev103117.service-now.com");
			
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("India@123");
		
		driver.findElement(By.xpath("//button[@class='pull-right btn btn-primary']")).click();		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		WebElement searchIncident=driver.findElement(By.id("filter"));
		searchIncident.sendKeys("Knowledge");
		Thread.sleep(2000);
		searchIncident.sendKeys(Keys.ENTER);

		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("button")).click();
		
		System.out.println("Article Created");
		
		driver.close();
		
	
	
}
}
