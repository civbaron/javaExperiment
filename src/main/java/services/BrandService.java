package services;

import java.util.LinkedList;
import java.util.List;
import models.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
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

    public void saveBrand(Brand brand){
        _brandRepository.save(brand);
    }
}
