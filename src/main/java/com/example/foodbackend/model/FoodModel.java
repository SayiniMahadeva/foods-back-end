package com.example.foodbackend.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FoodModel {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    String foodId;
    String foodName;
    String foodDescription;
    String foodUnitPrice;
    int numberofFood;


    public FoodModel() {
    }

    public FoodModel(String foodId, String foodName, String foodDescription, String foodUnitPrice, int numberofFood) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodUnitPrice = foodUnitPrice;
        this.numberofFood = numberofFood;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getFoodUnitPrice() {
        return foodUnitPrice;
    }

    public void setFoodUnitPrice(String foodUnitPrice) {
        this.foodUnitPrice = foodUnitPrice;
    }

    public int getNumberofFood() {
        return numberofFood;
    }

    public void setNumberofFood(int numberofFood) {
        this.numberofFood = numberofFood;
    }
}
