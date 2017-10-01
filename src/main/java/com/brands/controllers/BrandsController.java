package com.brands.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.brands.models.Brand;
import com.brands.services.BrandService;

import javax.websocket.server.PathParam;

@RestController
public class BrandsController {

    @Autowired
    BrandService _brandService;

    @GetMapping("/api/Brands")
    public List<Brand> getBrands() {
        return _brandService.getAllBrands();
    }

    @RequestMapping(value = "/api/Brands/{id}", method = RequestMethod.GET, params = "!myParam")
    public Brand getBrandById(@PathVariable Long id) {
        return _brandService.getBrandById(id);
    }

    @PostMapping("/api/Brands")
    public Brand postBrands(@RequestBody Brand brand)
    {
        return _brandService.saveBrand(brand);
    }
}
