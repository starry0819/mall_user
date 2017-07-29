package com.mrz.service;

import com.mrz.bean.T_mall_address;
import com.mrz.bean.T_mall_user;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AddressService {

	public List<T_mall_address> getAddressesByUser(T_mall_user user);
	
	public  void test(int id);

	public void testNew(int cloud);
	public T_mall_address getAddressByid(int id);
}
