package com.mrz.mapper;

import com.mrz.bean.T_mall_user;

public interface UserMapper {

	T_mall_user queryUserByLogin(T_mall_user user);

	int insertUser();

}
