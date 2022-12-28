package com.assignment.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class SearchBarSubmitTest extends BaseClass
{
	@Test
	
	public void search() throws InterruptedException
	{

	driver.findElement(By.xpath("//div[@class=\"_3qX0zy\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
