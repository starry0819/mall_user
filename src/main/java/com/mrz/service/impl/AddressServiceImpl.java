package com.mrz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrz.bean.T_mall_address;
import com.mrz.bean.T_mall_user;
import com.mrz.mapper.AddressMapper;
import com.mrz.service.AddressService;

public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressMapper addressMapper;

	@Override
	public List<T_mall_address> getAddressesByUser(T_mall_user user) {

		return addressMapper.queryAddressesByUser(user);
	}

	@Override
	public T_mall_address getAddressByid(int id) {
		return addressMapper.queryAddressByid(id);
	}

}
