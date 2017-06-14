package com.mrz.mapper;

import java.util.List;

import com.mrz.bean.T_mall_address;
import com.mrz.bean.T_mall_user;

public interface AddressMapper {

	T_mall_address queryAddressByid(int id);

	List<T_mall_address> queryAddressesByUser(T_mall_user user);

}
