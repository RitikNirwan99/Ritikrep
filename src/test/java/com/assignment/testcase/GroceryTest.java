package com.assignment.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class GroceryTest extends BaseClass
{
	@Test
	public void grocery() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class=\"xtXmba\"]")).click();
		Thread.sleep(3000);
		
		
		
	}
	

}
