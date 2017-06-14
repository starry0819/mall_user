package com.mrz.service;

import javax.jws.WebService;

import com.mrz.bean.T_mall_user;

@WebService
public interface UserService {
	
	public T_mall_user login(T_mall_user user);
	
	public int regist(T_mall_user user);
}
