package com.BellatrixFinalProject.Configuration;

import java.io.FileNotFoundException;


import com.BellatrixFinalProject.Utilities.FileUtil;

public class Configuration {

	FileUtil file = new FileUtil();

	public String getUrl() throws FileNotFoundException {
		return file.getProperty("/src/main/resources/config.properties", "appUrl");

	}

	public String getBrowserName() throws FileNotFoundException {
		return file.getProperty("/src/main/resources/config.properties", "browserName");
			
	}
	
	public void m1() throws FileNotFoundException {
		System.out.println(file.getProperty("/src/test/resources/Demo.properties", "CompanyName")) ;
		 System.out.println(file.getProperty("/src/test/resources/Demo.properties", "loginName"));
	}
	

	
	public static void main(String[] args) throws FileNotFoundException {
		Configuration con= new Configuration();
		System.out.println(con.getBrowserName());
		System.out.println(con.getUrl());
		con.m1();
	}
}


