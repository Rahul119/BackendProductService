package com.scaler.backendproductservice.Services;

public interface CategoryService {

    String getAllCategories();

    String getProductsInCategory(Long categoryId);
}
