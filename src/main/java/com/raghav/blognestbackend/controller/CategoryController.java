package com.raghav.blognestbackend.controller;

import com.raghav.blognestbackend.Entities.Category;
import com.raghav.blognestbackend.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CategoryController {
    @Autowired
    CategoryServices Cservices;

    @PostMapping("/categories")
    public void createCategoriesController(@RequestBody Category category){
        Cservices.createCategory(category);
    }
    @GetMapping("/categories")
    public List<Category> getCategoriesController(){
        return Cservices.getAllCategories();
    }
    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return Cservices.getCategoryById(id);
    }

}
