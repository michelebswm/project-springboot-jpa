package com.michelewm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michelewm.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
