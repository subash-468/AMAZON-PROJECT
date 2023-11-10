
package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//open a website
		driver.get("https://amazon.in/");
		//maximize the webpage
		driver.manage().window().maximize();
		//take the screenshort
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/amazon.png");
		FileUtils.copyFile(srcFile, destFile);
		Thread.sleep(3000);
		//Click onto the sign in page
		driver.findElement(By.id("nav-link-accountList")).click();
		//Thread.sleep(3000);
		//Enter the email id
		driver.findElement(By.id("ap_email")).sendKeys("aarthi@gmail.com");
		//Thread.sleep(3000);
		//click  to continu button
		driver.findElement(By.id("continue")).click();
		//Thread.sleep(3000);
		//enter the password
		driver.findElement(By.id("ap_password")).sendKeys("0123456789");
		//click in the submit button
		driver.findElement(By.id("signInSubmit")).click();
		File srcFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile4 = new File("./Screenshots/amazon.png");
		FileUtils.copyFile(srcFile, destFile);
		Thread.sleep(3000);
		//go to the search file
		WebElement e1 =  driver.findElement(By.id("searchDropdownBox"));
		Thread.sleep(3000);
		  e1.click();
		  Select dd = new Select(e1);
		  //select the amazon device
		  dd.selectByVisibleText("Amazon Devices");
		Thread.sleep(3000);
		//Enter iphone 13 in the search 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		Thread.sleep(3000);
		//click the submit button
		driver.findElement(By.id("nav-search-submit-button")).click();
		File srcFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile2 = new File("./Screenshots/amazon.png");
		FileUtils.copyFile(srcFile, destFile);
		//select the 1st product on the iphone 13
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		//click the submit button
		driver.findElement(By.id("add-to-wishlist-button-submit")).click();
		File srcFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./Screenshots/amazon.png");
		FileUtils.copyFile(srcFile, destFile);


		
	}

}
