package com.example.foodbackend.service;

import com.example.foodbackend.model.FoodModel;
import com.example.foodbackend.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("foodServiceImpl")
public class FoodServiceImpl implements FoodService{
    private FoodRepository foodRepository;

    @Override
    public List<FoodModel> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public Optional<FoodModel> findById(String foodId) {
        return foodRepository.findById(foodId);
    }

    @Override
    public FoodModel save(FoodModel productModel) {
        return foodRepository.save(productModel);
    }

    @Override
    public void deleteById(String foodId) {
        foodRepository.deleteById(foodId);
    }

    @Autowired
    public  void setFoodRepository(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

}
