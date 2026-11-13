package com.hellomitch4.store.repositories;

import com.hellomitch4.store.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}