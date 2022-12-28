package com.assignment.testcase;

import org.testng.annotations.Test;

import com.assignment.base.BaseClass;
import com.assignment.pages.LogInPage;

public class LogInPageTest extends BaseClass  {
	@Test
	public void login() throws InterruptedException {
		driver.findElement(LogInPage.input_user).sendKeys("9873488363");
		driver.findElement(LogInPage.input_password).sendKeys("9873488363a");
		driver.findElement(LogInPage.btn_submit).click();
		Thread.sleep(5000);
		
	}
	

}