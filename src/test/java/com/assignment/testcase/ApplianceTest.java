package com.assignment.testcase;

import java.time.Duration;

import org.openqa.selenium.By;

import com.assignment.base.BaseClass;

public class ApplianceTest extends BaseClass
{
	public void Appliance()
	{
	driver.findElement(By.xpath("//div[@class=\"xtXmba\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//div[@class=\"_3qX0zy\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
