package com.wmcserver.Repository;

import com.wmcserver.Class.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}