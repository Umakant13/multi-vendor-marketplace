package com.zosh.controller;

import com.zosh.exception.CartItemException;
import com.zosh.exception.UserException;

import com.zosh.model.CartItem;
import com.zosh.model.User;
import com.zosh.response.ApiResponse;
import com.zosh.service.CartItemService;
import com.zosh.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {

	private CartItemService cartItemService;
	private UserService userService;
	
	public CartItemController(CartItemService cartItemService, UserService userService) {
		this.cartItemService=cartItemService;
		this.userService=userService;
	}
	

}
