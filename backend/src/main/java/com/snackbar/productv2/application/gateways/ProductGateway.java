package com.snackbar.productv2.application.gateways;

// This should be an abstraction to allow a product to be created, no matter if in
// memory, in a database, or in a file.

import com.snackbar.productv2.domain.entity.Product;

public interface ProductGateway {
    Product createProduct(Product product);
}