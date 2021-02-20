package com.ws.usuario.entityRepo;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ws.usuario.entity.UserEnt;

@Repository
public interface IRepoUser extends MongoRepository<UserEnt, Serializable> {

	
}
