package com.hellomitch4.store.repositories;

import com.hellomitch4.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}