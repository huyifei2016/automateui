package cn.yifeiyun.dome1.demo1.suites;

import java.io.IOException;
import java.io.Reader;
import java.sql.Driver;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import bsh.This;
import cn.yifeiyun.dome1.demo1.pages.EmailPage;
import cn.yifeiyun.dome1.demo1.pages.HomePage;
import utils.SeleniumUtils;

public class Regester {

	private static Properties properties = new Properties();

	static {
		try {
			properties.load(Regester.class.getResourceAsStream("config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void isElement() {
		// TODO Auto-generated method stub

		WebDriver webDriver = new FirefoxDriver();
		try {
			webDriver.get(properties.getProperty("url"));
			for (int second = 0; second <= 10; second++) {
				if (second == 10) {
					throw new RuntimeException("timeout!!!!");
				}
				if (SeleniumUtils.check_Element(webDriver, By.xpath("")))
					break;
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Test
	public void login() {

		WebDriver webDriver = new FirefoxDriver();
		try {
			webDriver.get(properties.getProperty("url"));
			String curret_handle = webDriver.getWindowHandle();
			HomePage.button_email(webDriver);
			// 登录
			Thread.sleep(3000);
			Set<String> all_handle = webDriver.getWindowHandles();
			for (String str : all_handle) {

				if (curret_handle.equals(str)==false) {
					webDriver.switchTo().window(str);
					System.out.println("now regester window!");
					//Thread.sleep(2000);
					EmailPage.input_username(webDriver, "huyifei2016@sina.com");
					EmailPage.input_password(webDriver, "huyifei@127");
					EmailPage.botton_login(webDriver);
					//webDriver.close();

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
			// webDriver.quit();
		}

	}

}
