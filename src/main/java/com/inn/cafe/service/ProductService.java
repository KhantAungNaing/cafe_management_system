package com.inn.cafe.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.inn.cafe.wrapper.ProductWrapper;

public interface ProductService {

	ResponseEntity<String> addNewProduct(Map<String, String> requestMap);

	ResponseEntity<List<ProductWrapper>> getAllProducts();

	ResponseEntity<String> updateProduct(Map<String, String> requestMap);

}
