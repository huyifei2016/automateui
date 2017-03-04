package utils;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
	private WebDriver webDriver;

	public static void waits(WebDriverWait wait, WebDriver webDriver, By by) {
		wait.until((ExpectedConditions.presenceOfElementLocated(by)));
	}

	public static void captureScreen(String fileName, String folder)
			throws Exception {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screenSize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		// 保存路径
		File screenFile = new File(fileName);
		if (!screenFile.exists()) {
			screenFile.mkdir();
		}
		File f = new File(screenFile, folder);
		ImageIO.write(image, "png", f);
		// 自动打开
		if (Desktop.isDesktopSupported()
				&& Desktop.getDesktop().isSupported(Desktop.Action.OPEN))
			Desktop.getDesktop().open(f);
	}

	public static void screen_shot(String file) throws IOException {
		System.setProperty("phantomjs.binary.path", "phantomjs\\phantomjs.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		WebDriver webDriver = new PhantomJSDriver(capabilities);
		capabilities.setCapability("takesScreenshot", true);
		File scrFile = ((TakesScreenshot) webDriver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(file), true);
	}

	// 鼠标悬停
	public static void hovering(WebDriver webDriver) {
		Actions actions = new Actions(webDriver);
		actions.clickAndHold(
				webDriver.findElement(By.xpath("//*[@id='js_mail_url']/em[1]")))
				.perform();
		actions.release().perform();
	}

	// 判断一个元素是否存在

	public static boolean check_Element(WebDriver webDriver, By by) {

		try {

			webDriver.findElement(by);
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}
}
