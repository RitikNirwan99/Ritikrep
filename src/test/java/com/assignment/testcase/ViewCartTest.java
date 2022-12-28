package com.assignment.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class ViewCartTest extends BaseClass
{
	@Test
	
	public void viewOrder() {
		driver.findElement(By.xpath("//div[@class=\"KK-o3G\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

    

}
