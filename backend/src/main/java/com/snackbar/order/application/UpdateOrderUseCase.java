package com.snackbar.order.application;

import com.snackbar.order.domain.model.Order;

public interface UpdateOrderUseCase {
    Order updateOrder(Order order);
}
