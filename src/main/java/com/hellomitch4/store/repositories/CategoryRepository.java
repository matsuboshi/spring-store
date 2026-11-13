package com.hellomitch4.store.repositories;

import com.hellomitch4.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}