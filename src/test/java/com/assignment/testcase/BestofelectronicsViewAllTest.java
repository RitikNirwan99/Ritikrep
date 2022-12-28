package com.assignment.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class BestofelectronicsViewAllTest extends BaseClass
{
	@Test
	
	public void forwardkey() {
		
		driver.findElement(By.xpath("//a[@class=\"_2KpZ6l _3dESVI\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

    

}