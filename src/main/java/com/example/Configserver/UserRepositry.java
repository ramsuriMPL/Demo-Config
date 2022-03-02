package com.example.Configserver;

import org.springframework.data.repository.CrudRepository;

public interface UserRepositry  extends CrudRepository<User,Integer> {
}
