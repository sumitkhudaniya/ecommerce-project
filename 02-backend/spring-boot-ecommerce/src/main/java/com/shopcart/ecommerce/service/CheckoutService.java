package com.shopcart.ecommerce.service;

import com.shopcart.ecommerce.dto.Purchase;
import com.shopcart.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
