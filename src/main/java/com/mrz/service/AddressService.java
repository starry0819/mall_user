package com.mrz.service;

import java.util.List;

import javax.jws.WebService;

import com.mrz.bean.T_mall_address;
import com.mrz.bean.T_mall_user;

@WebService
public interface AddressService {

	public List<T_mall_address> getAddressesByUser(T_mall_user user);
	
	public T_mall_address getAddressByid(int id);
}
