package com.assignment.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class GroceryToHomeTest extends BaseClass
{
	@Test
	public void grocerytohome() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[@class=\"_3-BEeA\"]")).click();
		Thread.sleep(3000);
		
		
	}
	

}