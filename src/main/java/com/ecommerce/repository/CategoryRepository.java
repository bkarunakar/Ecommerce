package com.ecommerce.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category	, Long>,Serializable{
 
}
