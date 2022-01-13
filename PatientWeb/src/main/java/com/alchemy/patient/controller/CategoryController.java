package com.alchemy.patient.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alchemy.patient.model.Category;
import com.alchemy.patient.responses.ResponseData;
import com.alchemy.patient.service.CategoryService;




@RestController
@RequestMapping("/category")
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:8080" })
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save")
    public ResponseData saveCategory(@RequestBody Category category)
    {
        Category newCategory = categoryService.saveCategory(category);
        if(newCategory==null)
			return new ResponseData(400, null, "data not added");
        else
			return new ResponseData(200, newCategory, "success");
    }

    @GetMapping("/load")
    public ResponseData loadCategory()
    {
        List<Category> c= categoryService.loadCategory();
        if (c.size() > 0) {
            return new ResponseData(200, c, "success");
        }
        return new ResponseData(400, null, "Products not found");
    }
}
