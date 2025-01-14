package com.snackbar.basket.application.usecases;

import com.snackbar.basket.application.gateways.BasketUseCaseGateway;
import com.snackbar.basket.domain.entity.Basket;
import com.snackbar.basket.domain.entity.Item;
import org.springframework.stereotype.Service;

public class BasketUseCase {

    private final BasketUseCaseGateway basketUseCaseGateway;

    public BasketUseCase(BasketUseCaseGateway basketUseCaseGateway) {
        this.basketUseCaseGateway = basketUseCaseGateway;
    }

    public Basket createBasket(Basket basket) {
        return basketUseCaseGateway.createBasket(basket);
    }

    public Basket findBasket(String basketId) {
        return basketUseCaseGateway.findBasket(basketId);
    }

    public Basket addItemToBasket(String basketId, Item item) {
        return basketUseCaseGateway.addItemToBasket(basketId, item);
    }

    public Basket deleteItemToBasket(String basketId, String itemId) {
        return basketUseCaseGateway.deleteItemToBasket(basketId, itemId);
    }
}
