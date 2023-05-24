package com.product.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class DtoProductList{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("product_id")
    @Column(name = "product_id")
    private Integer product_id;

    @JsonProperty("gtin")
    @Column(name = "gtin")
    @NotNull(message="gtin is required")
    private String gtin;

    @JsonProperty("product")
    @Column(name = "product")
    @NotNull(message="product is required")
    private String product;

    @JsonProperty("price")
    @Column(name = "price")
    @NotNull(message="price is required")
    @Min(value=0, message="price must be positive")
    private Double price;

    @JsonIgnore
    @Column(name = "status")
    @Min(value =0, message = "status must be 0 or 1")
    @Max(value = 1, message = "status must be 0 or 1")
    private Integer status;
}
