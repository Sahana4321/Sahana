package com.alchemy.patient.repository;

import com.alchemy.patient.model.Category;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{

}
