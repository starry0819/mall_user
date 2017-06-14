package com.mrz.util;

public class PasswordUtil {
	
	public static String getMyPassword(String username, String password, String timestamp){
		String md5 = MD5Util.md5(username+password+timestamp);
		return md5;
	}
	
	public static String getServerTimestamp(){
		return System.currentTimeMillis()+"";
	}
}
