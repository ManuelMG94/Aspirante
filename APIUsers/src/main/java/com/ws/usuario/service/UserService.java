package com.ws.usuario.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ws.usuario.DBPersistenceContracts.IDBUsers;
import com.ws.usuario.entity.UserEnt;


@RestController()
public class UserService {
	
	@Autowired
	private IDBUsers _dbUser;
	
	@PostMapping(value = "/user/save")
	public String SaveUser(@RequestBody UserEnt user) {
		try {
			return _dbUser.SaveUser(user);	
		}catch (Exception e) {
			return "";
		}
	}
	
	@GetMapping(value = "/users")
	public @ResponseBody List<UserEnt> GetAllUsers(){
		List<UserEnt> dataReturn =new ArrayList<UserEnt>();
		try {
			dataReturn=_dbUser.GetAllUsers();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return dataReturn;	
	}
	
	@GetMapping(value = "/user/{id}")
	public @ResponseBody UserEnt GetUserById(@PathVariable String id) {
		UserEnt dataReturn =new UserEnt();
		
		try {
			System.out.println("Usuario a recuperar: "+id);
			dataReturn=_dbUser.GetUserById(id);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return dataReturn;
	}
	
	@PutMapping(value = "/user/update")
	public boolean UpdateUser(@RequestBody UserEnt user){
		boolean actualizado=true;
		
		try {
			actualizado=_dbUser.UpdateUser(user);
		}catch(Exception ex) {
			
		}
		return actualizado;
	}
	
	@DeleteMapping(value = "/user/delete/{id}")
	public  @ResponseBody UserEnt DeleteUser(@PathVariable String id) {
		boolean eliminado=true;
		UserEnt dataReturn =new UserEnt();
		
		try {
			dataReturn=_dbUser.GetUserById(id);
			eliminado=_dbUser.DeleteUser(id);
		}catch(Exception ex) {
			
		}
		return dataReturn;
	}
	
	
	
	
}
