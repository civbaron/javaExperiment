package services;

import org.springframework.data.repository.CrudRepository;
import models.Brand;
import org.springframework.stereotype.Component;

@Component
public interface BrandRepository extends CrudRepository<Brand, Long> {
}
