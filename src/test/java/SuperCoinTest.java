import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.assignment.base.BaseClass;

public class SuperCoinTest extends BaseClass
{
	@Test
	public void SuperCoin()
	{
		//Instantiating Actions class
				Actions actions = new Actions(driver);
				//Hovering on main menu
				WebElement mainMenu = driver.findElement(By.xpath("//div[@class=\"exehdJ\"]"));

				
				actions.moveToElement(mainMenu).build().perform();
				driver.findElement(By.xpath("//div[@class=\"_3vhnxf\" and text()=\"SuperCoin Zone\"]")).click();
    }

		

}
