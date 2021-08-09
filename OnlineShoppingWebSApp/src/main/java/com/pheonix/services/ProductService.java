package com.pheonix.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.service.spi.ServiceException;

import com.pheonix.entity.Product;
import com.pheonix.exception.ProductNotFoundException;

public interface ProductService {

	ArrayList<Product> findAll() throws ServiceException;

	Product findProductByld(Product product) throws ProductNotFoundException;

	void add(Product product) throws ServiceException;

	void edit(Product product) throws ServiceException;

	void remove(Product product) throws ServiceException, SQLException;

	List<Product> findByName(String name) throws ServiceException;

	List<Product> findByBrand(String brand) throws ServiceException;

	List<Product> findByPrice(float price) throws ServiceException;

	List<Product> findByPriceRange(float minPrice, float maxPrice) throws ServiceException;

	List<Product> findByNameAndBrand(String name, String brand) throws ServiceException;

	List<Product> findByNameAndPrice(String name, float price) throws ServiceException;

	List<Product> findByBrandAndPrice(String brand, float price) throws ServiceException;

	List<Product> sortByName() throws ServiceException;

	List<Product> sortByBrand() throws ServiceException;

	List<Product> sortByPrice() throws ServiceException;

	List<Product> sortByPriceDesc() throws ServiceException;
}