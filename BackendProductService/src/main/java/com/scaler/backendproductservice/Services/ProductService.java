package com.scaler.backendproductservice.Services;

import com.scaler.backendproductservice.DTOs.AddProductDTO;
import com.scaler.backendproductservice.Exceptions.NotFoundException;
import com.scaler.backendproductservice.Models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAllProducts();
    Optional<Product> getSingleProduct(Long productId) throws NotFoundException;

    Product AddNewProduct(AddProductDTO addProductDTO);
    /*
        Product object has only those fields filled which need to be updated.
            Everything else is null
 */
    Product updateProduct(Long productId, Product product);
    // if (product.getImageUrl() != null) {
    //
    // }
    Product replaceProduct(Long productId, Product product);

    boolean deleteProduct(Long productId);


}
