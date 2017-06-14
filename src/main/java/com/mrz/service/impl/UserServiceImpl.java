package com.mrz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrz.bean.T_mall_user;
import com.mrz.mapper.UserMapper;
import com.mrz.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public T_mall_user login(T_mall_user user) {
		return userMapper.queryUserByLogin(user);
	}

	@Override
	public int regist(T_mall_user user) {
		return userMapper.insertUser();
	}

}
