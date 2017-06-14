package com.mrz.test;

import com.mrz.util.MD5Util;

public class UserTest {
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		String s = "cxfwss4j"+currentTimeMillis;
		String md5 = MD5Util.md5(s);
		System.err.println(md5);
	}
}
