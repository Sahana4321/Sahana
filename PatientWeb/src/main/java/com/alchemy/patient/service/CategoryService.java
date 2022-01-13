package com.alchemy.patient.service;

import java.util.List;

import com.alchemy.patient.model.Category;
import com.alchemy.patient.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category)
    {
        try{
            categoryRepository.insert(category);
            return category;
        }catch(Exception e){
            return null;
        }
    }

    public Category get(String id)
    {
        try{
            return categoryRepository.findById(id).get();
        }catch(Exception e)
        {
            return null;
        }
    }

    public List<Category> loadCategory()
    {
        try{
            List<Category> c= categoryRepository.findAll();
            return c;
        }catch(Exception e)
        {
            return null;
        }
    }
}