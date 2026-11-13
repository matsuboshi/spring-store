package com.hellomitch4.store.repositories;

import com.hellomitch4.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
