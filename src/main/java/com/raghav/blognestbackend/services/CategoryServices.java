package com.raghav.blognestbackend.services;

import com.raghav.blognestbackend.Entities.Category;
import com.raghav.blognestbackend.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepo categoryRepo;

    public void createCategory(Category category) {
         categoryRepo.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }
}
