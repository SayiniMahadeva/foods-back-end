package com.example.foodbackend.repository;

import com.example.foodbackend.model.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodModel, String> {
}
