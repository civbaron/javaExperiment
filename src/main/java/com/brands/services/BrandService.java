package com.brands.services;

import java.util.LinkedList;
import java.util.List;
import com.brands.models.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {

    @Autowired
    BrandRepository _brandRepository;

    public List<Brand> getAllBrands(){
        List<Brand> brands = new LinkedList<>();

        for(Brand brand : _brandRepository.findAll()){
            brands.add(brand);
        }
        return brands;
    }

    public Brand getBrandById(Long id){
        return _brandRepository.findOne(id);
    }

    public Brand saveBrand(Brand brand){
        return _brandRepository.save(brand);
    }
}
