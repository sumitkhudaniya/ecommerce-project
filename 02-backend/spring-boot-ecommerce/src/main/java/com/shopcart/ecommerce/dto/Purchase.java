package com.shopcart.ecommerce.dto;

import com.shopcart.ecommerce.entity.Address;
import com.shopcart.ecommerce.entity.Customer;
import com.shopcart.ecommerce.entity.Order;
import com.shopcart.ecommerce.entity.OrderItem;
import java.util.Set;
import lombok.Data;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
