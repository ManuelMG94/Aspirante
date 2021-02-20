package com.ws.usuario.DBPersistenceContracts;

import java.util.List;

import com.ws.usuario.entity.UserEnt;

public interface IDBUsers {
	String SaveUser(UserEnt userData);
	UserEnt GetUserById(String userId);
	List<UserEnt> GetAllUsers();
	boolean UpdateUser(UserEnt userData);
	boolean DeleteUser(String userId);
}
