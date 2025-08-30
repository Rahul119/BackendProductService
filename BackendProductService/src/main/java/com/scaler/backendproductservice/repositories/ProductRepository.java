package com.scaler.backendproductservice.repositories;

import com.scaler.backendproductservice.DTOs.ProductDBDTo;
import com.scaler.backendproductservice.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save(Product product);
    Product findProductById(long id);
    Product findProductByIdIs(long id);
    Product findProductByIdEquals(long id);

    Product findByPriceBetweenAndTitleLessThanEqual(double greaterThanEqualPrice, double lessThanEqualPrice, String titleLessThan);

    Product findByPriceLessThanEqual(double price);

    List<Product> findByImageUrlIsNullOrderByIdDesc();

    List<Product> findByTitleLikeIgnoreCase(String title);

    List<Product> findByTitleIgnoreCaseStartingWith(String title);

    @Query(value = Queries.LAAO_PRODUCTS_WITH_ID_QUERY, nativeQuery = true)
//    @Modifying
    List<ProductDBDTo> laaoProductsWithId(Long id);

    @Query("select p.title from Product p where p.id = :id and p.category.name = :categoryName")
    public List<Product> getByIdAndTitle(Long id, String categoryName);





}
