package cn.yifeiyun.dome1.demo1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmailPage {
	
	
 
	/**
	 * email首页
	 * @throws SeleniumException 
	 */

	public static void input_username(WebDriver webDriver,String send_string) throws SeleniumException {

		try {
			webDriver.findElement(By.id("userNameIpt")).sendKeys(send_string);
		} catch (Exception e) {
			throw new SeleniumException(e); // TODO: handle exception
		}

	}

	public static void input_password(WebDriver webDriver, String send_string) throws SeleniumException {

		try {

			webDriver.findElement(By.id("pwdInput")).sendKeys(send_string);
		} catch (Exception e) {
			// TODO: handle exception
			throw new SeleniumException(e);
		}

	}
	public static void botton_login(WebDriver webDriver) throws SeleniumException{
		
		try {
			
			
			webDriver.findElement(By.id("btnSubmit")).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		throw new SeleniumException(e);
		
		}
	}
	

}
