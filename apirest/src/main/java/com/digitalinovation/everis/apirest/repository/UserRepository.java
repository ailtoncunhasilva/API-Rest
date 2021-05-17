package com.digitalinovation.everis.apirest.repository;

import com.digitalinovation.everis.apirest.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
