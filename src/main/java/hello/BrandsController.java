package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.hibernate.cache.internal.NaturalIdCacheKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import models.Brand;
import services.BrandService;

@RestController
public class BrandsController {

    @GetMapping("/api/Brands")
    public List<Brand> brands() {
        return new BrandService().getAllBrands();
    }

    /*public Brand greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }*/
}
