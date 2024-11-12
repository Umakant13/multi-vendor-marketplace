package com.zosh.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zosh.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Cart findByUserId(Long userId);
}
