package com.hellomitch4.store.repositories;

import com.hellomitch4.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}