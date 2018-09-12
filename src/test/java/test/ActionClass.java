package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class ActionClass {
	
	public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/caw/Documents/seleniumjAR/chromedriver");
	driver =new ChromeDriver();
	driver.get("https://www.freecrm.com/index.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.findElement(By.xpath("//*[@id=\"nav-main\"]/li[6]/a")).click();
//	driver.findElement(By.name("userName")).sendKeys("akshay.mamulwar@bnt-soft.com");
//	driver.findElement(By.name("password")).sendKeys("password");
//	driver.findElement(By.xpath("//*[@id=\"content\"]/app-login/section/div/div/div/form/div[2]/button")).click();
//	driver.findElement(By.xpath("//*[@id=\"nav-main\"]/li[6]/a")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//child::li[1]")).click();
    System.out.println("end");
	
	
	}
}

