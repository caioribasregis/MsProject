package com.example.msproject.domain.port.out;

import com.example.msproject.domain.Product;

import java.util.List;

public interface ProductInterfaceOut {

    List<Product> getProductList();

    Product getProductByid();

    void saveProduct(Product product);

}
