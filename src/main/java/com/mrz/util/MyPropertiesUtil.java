package com.mrz.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropertiesUtil {
	
	public static String getProperty(String key){
		Properties properties = new Properties();
		InputStream resourceAsStream = MyPropertiesUtil.class.getClassLoader().getResourceAsStream("password.properties");
		try {
			properties.load(resourceAsStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}
}
