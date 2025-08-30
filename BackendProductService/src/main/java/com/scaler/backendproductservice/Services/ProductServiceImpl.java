package com.scaler.backendproductservice.Services;


import com.scaler.backendproductservice.DTOs.ProductDTO;
import com.scaler.backendproductservice.Exceptions.NotFoundException;
import com.scaler.backendproductservice.Models.Product;
import com.scaler.backendproductservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Optional<Product> getSingleProduct(Long productId) throws NotFoundException {
        return Optional.empty();
    }

    @Override
    public Product AddNewProduct(ProductDTO addProductDTO) {

       return null;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }
}
