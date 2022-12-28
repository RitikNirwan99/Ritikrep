package com.assignment.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class InputInSearchBarTest extends BaseClass
{
	@Test
	public void search() throws InterruptedException
	{


	driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
