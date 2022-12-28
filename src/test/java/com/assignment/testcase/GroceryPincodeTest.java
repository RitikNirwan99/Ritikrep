package com.assignment.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class GroceryPincodeTest extends BaseClass
{
	@Test
	public void grocery() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//input[@class=\"_166SQN\"]")).sendKeys("121001");
		
		Thread.sleep(3000);
	}
		
		
		
}	