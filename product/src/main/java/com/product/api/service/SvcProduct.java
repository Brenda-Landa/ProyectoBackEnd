package com.product.api.service;

import com.product.api.dto.ApiResponse;
import com.product.api.entity.Category;
import com.product.api.entity.DtoProductList;
import com.product.api.entity.Product;

import java.util.List;

public interface SvcProduct {

	public List<DtoProductList> getProducts();
	public Product getProduct(String gtin);
	public ApiResponse createProduct(Product in);
	public ApiResponse updateProduct(Product in, Integer id);
	public ApiResponse updateProductStock(String gtin, Integer stock);
	public ApiResponse updateProductCategory(String gtin, Category in);
	public ApiResponse deleteProduct(Integer id);

}
