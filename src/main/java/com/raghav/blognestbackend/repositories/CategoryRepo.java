package com.raghav.blognestbackend.repositories;

import com.raghav.blognestbackend.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository <Category,Long>{
}
