package com.example.foodbackend.bootstrap;

import com.example.foodbackend.model.FoodModel;
import com.example.foodbackend.repository.FoodRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AddDumyFood {
    @Bean
    CommandLineRunner initSalonDataBase(FoodRepository foodRepository) {
        return args -> foodRepository.save(new FoodModel("001", "Rice", "It is very tasty food", "180.00", 100));

    };
}
