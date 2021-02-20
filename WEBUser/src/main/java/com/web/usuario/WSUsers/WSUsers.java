package com.web.usuario.WSUsers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.web.usuario.Beans.BeanUser;
import com.web.usuario.WSUserContract.IWSUsers;

@Service
public class WSUsers implements IWSUsers{

	@Autowired
	private RestTemplate ApRestTemplate;
	
	@Override
	public List<BeanUser> GetAll() {
		List<BeanUser> users=Arrays.asList(ApRestTemplate.getForObject("http://localhost:8080/users/", BeanUser[].class));
		
		return users;
	}

	@Override
	public BeanUser FindById(String id) {
		Map<String,String> pathVariables=new HashMap<String,String>();
		pathVariables.put("id", id);
		
		BeanUser user=ApRestTemplate.getForObject("http://localhost:8080/user/{id}", BeanUser.class,pathVariables);
		
		return user;
	}

	@Override
	public String Save(BeanUser userData) {
		HttpEntity<BeanUser> body=new HttpEntity<BeanUser>(userData);
		ResponseEntity<String> response=ApRestTemplate.exchange("http://localhost:8080/user/save", HttpMethod.POST,body,String.class);
		
		return response.getBody();
	}

	@Override
	public BeanUser Delete(String id) {
		HttpEntity<String> body=new HttpEntity<String>(id);
		
		ResponseEntity<BeanUser> resp=ApRestTemplate.exchange("http://localhost:8080/user/delete/"+id,HttpMethod.DELETE,body, BeanUser.class);
		
		
		return resp.getBody();
	}
	
	
}
