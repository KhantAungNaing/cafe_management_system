package com.inn.cafe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inn.cafe.model.Product;
import com.inn.cafe.wrapper.ProductWrapper;

public interface ProductDao extends JpaRepository<Product, Integer>{

	List<ProductWrapper> getAllProducts();

}
