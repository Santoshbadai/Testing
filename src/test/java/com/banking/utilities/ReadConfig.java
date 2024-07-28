package com.banking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("exception is " + e.getMessage());
		}
	}
	
	public String GetapplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String Username() {
		String username=pro.getProperty("usn");
		return username;
	}
	
	public String Password() {
		String password=pro.getProperty("pasw");
		return password;
	}
	
	public String Chrome() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String Iepath() {
		String ieEdge=pro.getProperty("iepath");
		return ieEdge;
	}
	
	public String Firefox() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	
}
