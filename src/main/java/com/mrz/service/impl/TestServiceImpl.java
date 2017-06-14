package com.mrz.service.impl;

import com.mrz.service.TestService;

public class TestServiceImpl implements TestService {

	@Override
	public String ping() {
		System.out.println("测试服务");
		return "pong";
	}

}
