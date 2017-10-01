package com.brands;

import com.brands.services.BrandService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.brands.models.Brand;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(BrandService service) {
        return (args) -> {
            service.saveBrand((new Brand(Long.parseLong("1"), "Nike Shoe Company", "This is a shoe company.")));
            service.saveBrand((new Brand(Long.parseLong("2"), "Spacely Sprokets", "The Jetsons.")));
            service.saveBrand((new Brand(Long.parseLong("3"), "Jordach", "This is a shoe company.")));
            service.saveBrand((new Brand(Long.parseLong("4"), "Pepsi", "This is a soda company.")));
        };
    }
}
