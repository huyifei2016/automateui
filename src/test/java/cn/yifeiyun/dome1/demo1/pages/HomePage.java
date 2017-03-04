package cn.yifeiyun.dome1.demo1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.NewProfileExtensionConnection;

public class HomePage {

	/**
	 * 163首页
	 * 
	 * @throws SeleniumException
	 */

	/**
	 * 邮箱图按钮
	 * 
	 * @throws SeleniumException
	 */

	public static void  button_email(WebDriver webDriver) throws SeleniumException
	{
		
	try {
			
			webDriver.findElement(By.id("js_mail_url")).click();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new SeleniumException(e);
			
		}
		
		
	}

}
