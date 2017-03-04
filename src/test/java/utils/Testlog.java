package utils;

import java.io.IOException;
import java.nio.file.Path;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jboss.netty.handler.ssl.SslBufferPool;

import bsh.This;


public class Testlog {
	
	public void ss()
	
	{
		
		System.out.println("ddd");
	}
	
	
	private static Logger  logger=Logger.getLogger(Testlog.class);
	SeleniumUtils ss=new SeleniumUtils();
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("eeeeeeeee");
		logger.info("jjjjjjjj");
		logger.error("yyyyyyyy");
		
    /*Testlog tt=new Testlog();
   

		try {
			SeleniumUtils.captureScreen("D:", "22.jpg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
	}

}
