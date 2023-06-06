package com.example.msproject.domain.port.in;

import com.example.msproject.domain.dto.ProductDto;

import java.util.List;

public interface ProductInterfaceIn {

    List<ProductDto> getProductList();

    void createProduct(ProductDto productDto);

    void stockUpdate(ProductDto productDto);


}
