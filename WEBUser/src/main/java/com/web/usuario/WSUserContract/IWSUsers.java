package com.web.usuario.WSUserContract;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.web.usuario.Beans.BeanUser;

public interface IWSUsers {
	//RestTemplate
	List<BeanUser> GetAll();
	BeanUser FindById(String id);
	String Save(BeanUser userData);
	BeanUser Delete(String id);
}
