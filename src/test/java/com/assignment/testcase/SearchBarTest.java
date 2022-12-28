package com.assignment.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class SearchBarTest extends BaseClass{
	@Test
	
	public void search() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("iphone14");
		Thread.sleep(5000);
		
		
	}
}
