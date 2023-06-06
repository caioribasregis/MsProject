package com.example.msproject.domain;

import com.example.msproject.domain.dto.ProductDto;

import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private Long price;
    private Double quantity;

    public Product() {
    }

    public Product(UUID id, String name, Long price, Double quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(ProductDto productDto) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public ProductDto stockUpdate(){
        return new ProductDto(name, price, quantity);
    }
}
