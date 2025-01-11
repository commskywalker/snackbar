package com.snackbar.productv2.application.gateways;

// This should be an abstraction to allow a product to be created, no matter if in
// memory, in a database, or in a file.

import com.snackbar.productv2.domain.entity.Productv2;

public interface Productv2Gateway {
    Productv2 createProductv2(Productv2 productv2);
    Productv2 getProductv2(Productv2 productv2);
}
