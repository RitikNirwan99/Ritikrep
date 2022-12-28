package com.assignment.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class ForwardKeyTest extends BaseClass
{
	@Test
	
	public void forwardkey() {
		
		driver.findElement(By.xpath("//div[@class=\"_2t2dSp\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

    

}