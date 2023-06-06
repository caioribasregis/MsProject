package com.example.msproject.adapter.controller;

import com.example.msproject.domain.dto.ProductDto;
import com.example.msproject.domain.port.in.ProductInterfaceIn;
import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    ProductInterfaceIn productInterfaceIn;

    public ProductController(ProductInterfaceIn productInterfaceIn){
        this.productInterfaceIn = productInterfaceIn;
    }

    @GetMapping
    List<ProductDto> getProductDtoList(){
        return productInterfaceIn.getProductList();
    }

    @PostMapping
    void createProduct(@RequestBody ProductDto productDto){
        productInterfaceIn.createProduct(productDto);
    }

    @PutMapping("/{id}")
    void stockUpdate(@PathVariable Long id ,@RequestBody ProductDto productDto) throws NotFoundException {
        productInterfaceIn.stockUpdate(productDto);
    }





}
