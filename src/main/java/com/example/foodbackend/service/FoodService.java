package com.example.foodbackend.service;

import com.example.foodbackend.model.FoodModel;

import java.util.List;
import java.util.Optional;

public interface FoodService {
    List<FoodModel> findAll();
    Optional<FoodModel> findById(String foodId);
    FoodModel save(FoodModel foodModel);
    void deleteById(String foodId);
}
