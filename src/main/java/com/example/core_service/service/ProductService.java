package com.example.core_service.service;
import com.example.core_service.entity.Product;
import com.example.core_service.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Получить все продукты
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Получить продукт по ID
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    // Создать новый продукт
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Обновить продукт
    public Product updateProduct(Long id, Product productDetails) {
        Product product = getProductById(id);
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setQuantity(productDetails.getQuantity());
        return productRepository.save(product);
    }

    // Удалить продукт
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
