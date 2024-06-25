package com.BellatrixFinalProject.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {
	public String getProperty(String filePath, String key) throws FileNotFoundException {
		String baseDir = System.getProperty("user.dir");

		FileInputStream file = new FileInputStream(baseDir + filePath);
		Properties prop = new Properties();

		String value = "";
		try {
			prop.load(file);
			value = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public String getPropertHardCode() throws IOException {
		String baseDir= System.getProperty("user.dir");
		
		FileInputStream file= new FileInputStream(baseDir+"/src/main/resources/config.properties");
		Properties prop= new Properties();
		prop.load(file);
		return prop.getProperty("browserName");
		
	}
}
