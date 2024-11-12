package com.zosh.service.impl;

import com.zosh.exception.CartItemException;
import com.zosh.exception.UserException;

import com.zosh.model.Cart;
import com.zosh.model.CartItem;
import com.zosh.model.Product;
import com.zosh.model.User;
import com.zosh.repository.CartItemRepository;
import com.zosh.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartItemServiceImplementation implements CartItemService {
	
	private CartItemRepository cartItemRepository;


	@Autowired
	public CartItemServiceImplementation(CartItemRepository cartItemRepository) {
		this.cartItemRepository=cartItemRepository;

	}



	@Override
	public CartItem updateCartItem(Long userId,
								   Long id, CartItem cartItem)
			throws CartItemException, UserException {
		
		CartItem item=findCartItemById(id);
		User cartItemUser=item.getCart().getUser();
		
		if(cartItemUser.getId().equals(userId)) {
			
			item.setQuantity(cartItem.getQuantity());
			item.setMrpPrice(item.getQuantity()*item.getProduct().getMrpPrice());
			item.setSellingPrice(item.getQuantity()*item.getProduct().getSellingPrice());
			
			return cartItemRepository.save(item);
				
			
		}
		else {
			throw new CartItemException("You can't update  another users cart_item");
		}
		
	}
	

	@Override
	public void removeCartItem(Long userId,Long cartItemId)
			throws CartItemException,
			UserException {
		
		System.out.println("userId- "+userId+" cartItemId "+cartItemId);
		
		CartItem cartItem=findCartItemById(cartItemId);
		
		User cartItemUser=cartItem.getCart().getUser();

		if(cartItemUser.getId().equals(userId)) {
			cartItemRepository.deleteById(cartItem.getId());
		}
		else {
			throw new UserException("you can't remove anothor users item");
		}
		
	}

	@Override
	public CartItem findCartItemById(Long cartItemId) throws CartItemException {
		Optional<CartItem> opt=cartItemRepository.findById(cartItemId);
		
		if(opt.isPresent()) {
			return opt.get();
		}
		throw new CartItemException("cartItem not found with id : "+cartItemId);
	}

}
