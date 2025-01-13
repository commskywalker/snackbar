package com.snackbar.basket.infrastructure.controllers;

import com.snackbar.basket.domain.entity.Basket;
import com.snackbar.basket.domain.entity.Item;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

public class BasketDTOMapper {

    public Basket toBasket(CreateBasketRequest request) {
        List<Item> items = request.items().stream()
                .map(this::toItem)
                .collect(Collectors.toList());
        return new Basket(
                request.id(),
                request.basketDateTime(),
                request.cpf(),
                request.name(),
                items,
                request.totalPrice()
        );
    }

    public CreateBasketResponse toResponse(Basket basket) {
        List<ItemResponse> items = basket.items().stream()
                .map(this::toItemResponse)
                .collect(Collectors.toList());
        return new CreateBasketResponse(
                basket.id(),
                basket.basketDateTime(),
                basket.cpf(),
                basket.name(),
                items,
                basket.totalPrice()
        );
    }

    public Item toItem(ItemRequest request) {
        return new Item(
                request.id(),
                request.name(),
                request.quantity(),
                request.price(),
                request.cookingTime(),
                request.customization()
        );
    }

    private ItemResponse toItemResponse(Item item) {
        return new ItemResponse(
                item.id(),
                item.name(),
                item.quantity(),
                item.price(),
                item.cookingTime(),
                item.customization()
        );
    }
}