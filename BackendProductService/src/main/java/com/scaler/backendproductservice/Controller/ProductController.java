package com.scaler.backendproductservice.Controller;

import com.scaler.backendproductservice.DTOs.AddProductDTO;
import com.scaler.backendproductservice.Models.Product;
import com.scaler.backendproductservice.Services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {

      private ProductService productService;
//    private ProductRepository productRepository;
//
//    public ProductController(ProductService productService, ProductRepository productRepository) {
//        this.productRepository = productRepository;
//        this.productService = productService;
//    }
    
    @GetMapping("/products")
    public String getAllProducts() {
        return "Getting All Products";
    }

    @GetMapping("/products/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId) {
        return "Getting Single Product with Product Id: " + productId;
    }

    @PostMapping("/products")
    public ResponseEntity<Product> addNewProduct(@RequestBody AddProductDTO addProductDTO) {

        return ResponseEntity.ok(productService.AddNewProduct(addProductDTO));
    }
//    public String addNewProduct(@RequestBody AddProductDTO  productDTO) {
//        return "Adding New Product " + productDTO;
//    }

    public String updateProduct() {
        return "Updating Product";
    }

    public String deleteProduct() {
        return "Deleting Product";
    }
}
