package com.invoice.api.service;

import com.invoice.api.dto.ApiResponse;
import com.invoice.api.entity.Cart;

import java.util.List;

public interface SvcCart {

	public List<Cart> getCart(String rfc);
	public ApiResponse addToCart(Cart cart);
	public ApiResponse removeFromCart(Integer cart_id);
	public ApiResponse clearCart(String rfc);

}
