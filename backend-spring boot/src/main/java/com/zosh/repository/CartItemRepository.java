package com.zosh.repository;

import com.zosh.model.Cart;
import com.zosh.model.Product;
import com.zosh.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zosh.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
