package com.assignment.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class BackwardKeyTest extends BaseClass
{
	@Test
	
	public void backwardkey() {
		
		driver.findElement(By.xpath("//div[@class=\"_24OVr-\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

    

}
