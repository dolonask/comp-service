package kg.megalab.comp_service.service.impl;

import kg.megalab.comp_service.model.Product;
import kg.megalab.comp_service.repo.ProductRepo;
import kg.megalab.comp_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<String> findMakersByType(String type) {
        List<Product> products = productRepo.findByTypeEqualsIgnoreCase(type);
        return products
                .stream()
                .map(Product::getMaker)
                .distinct()
                .toList();
    }
}
