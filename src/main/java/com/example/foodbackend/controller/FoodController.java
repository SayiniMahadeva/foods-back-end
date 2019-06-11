package com.example.foodbackend.controller;

import com.example.foodbackend.model.FoodModel;
import com.example.foodbackend.service.FoodService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/foods")
public class FoodController {
    private FoodService foodService;

    @GetMapping("/")
    public List<FoodModel> getdetails() {
        return foodService.findAll();
    }

    @PostMapping("/")
    public FoodModel create(@RequestBody FoodModel foodModel) {
        return foodService.save(foodModel);
    }

    @GetMapping("/{foodId}")
    public FoodModel get(@PathVariable String foodId) {
        Optional<FoodModel> foodModel = foodService.findById(foodId);
        if (foodModel.isPresent()) {
            return foodModel.get();
        }
        return null;
    }
    @PutMapping("/{foodId}")
    public FoodModel update(@PathVariable String foodId, @RequestBody FoodModel foodModel) {
        Optional<FoodModel> existingFoodModel = foodService.findById(foodId);
        if(existingFoodModel.isPresent()) {
            BeanUtils.copyProperties(foodModel, existingFoodModel);
            System.out.println("update");
            return foodService.save(foodModel);
        }
        return null;
    }

    @DeleteMapping("/{foodId}")
    public void delete(@PathVariable String foodId) {
        Optional<FoodModel> existingFoodModel = foodService.findById(foodId);
        if(existingFoodModel.isPresent()) {
            foodService.deleteById(foodId);
        }
    }

    @Autowired
    public void setFoodService(FoodService foodService) {
        this.foodService = foodService;
    }
}
