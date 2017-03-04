package cn.yifeiyun.dome1.demo1.suites;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cn.yifeiyun.dome1.demo1.pages.EmailPage;

public class Testdemo {
	
	
	@Test
	public void email_login()
	{
		WebDriver webDriver=new FirefoxDriver();
		webDriver.get("http://email.163.com/#from=163nav_icon");
		
		try{
			EmailPage.input_username(webDriver,"huyifei2016@sina.com");
			EmailPage.input_password(webDriver, "huyifei@127");
			EmailPage.botton_login(webDriver);
			
		}catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(""+e);
		}
		
		
	}

}
