package com.clickawaiter.qa.newcust;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.junit.Assert;
import org.junit.Test;




public class TestBase {
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "/home/caw/Documents/seleniumjAR/chromedriver");
//	DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();   
//	handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
	driver=new ChromeDriver();
	driver.get("");
	driver.findElement(By.xpath("//*[@id=\"nav-main\"]/li[6]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("userName")).sendKeys("username");
	driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-login/section/div/div/div/form/div[2]/button/span[1]")).click();
    Assert.assertEquals(true, false);
    System.out.println("test");
	
	}
	

}
