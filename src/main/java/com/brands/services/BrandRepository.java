package com.brands.services;

import org.springframework.data.repository.CrudRepository;
import com.brands.models.Brand;
import org.springframework.stereotype.Component;

@Component
public interface BrandRepository extends CrudRepository<Brand, Long> {
}
