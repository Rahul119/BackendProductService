package com.scaler.backendproductservice.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RatingDto implements Serializable {
    private double rate;
    private double count;
}
