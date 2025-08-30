package com.scaler.backendproductservice.DTOs;

import com.scaler.backendproductservice.Models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetSingleProductResponseDto {

    private Product product;
}
