package com.ws.usuario.DBPersistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.usuario.DBPersistenceContracts.IDBUsers;
import com.ws.usuario.entity.UserEnt;
import com.ws.usuario.entityRepo.IRepoUser;

@Service
public class DBUsers implements IDBUsers{

	@Autowired
	private IRepoUser _repoUsr;
	@Override
	public String SaveUser(UserEnt userData) {
		
		
		_repoUsr.save(userData);
		return userData.getUserId();
	}

	@Override
	public UserEnt GetUserById(String userId) {
		
		UserEnt userEnt=_repoUsr.findById(userId).get();
		return userEnt;
	}

	@Override
	public List<UserEnt> GetAllUsers() {
		
		List<UserEnt> users=_repoUsr.findAll();
		
		return users;
	}

	@Override
	public boolean UpdateUser(UserEnt userData) {
		try {
			_repoUsr.save(userData);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public boolean DeleteUser(String userId) {
		try {
			_repoUsr.deleteById(userId);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
