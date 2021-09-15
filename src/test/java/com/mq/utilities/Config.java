package com.mq.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
 Properties pro;
	public Config() 
	{
		File srcfile = new File("./configurations/config.properties");
		try {
			FileInputStream fis= new FileInputStream(srcfile);
			pro= new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("No file found");
		}
				
	}
	public String geturl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	public String getusername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getpassword()
	{
		String pwd=pro.getProperty("pwd");
		return pwd;
	}
	public String chromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath()
	{
		String getfirefoxpath=pro.getProperty("getfirefoxpath");
		return getfirefoxpath;
	}
}
