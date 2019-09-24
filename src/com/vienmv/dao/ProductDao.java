package com.vienmv.dao;

import java.util.ArrayList;
import java.util.List;

import com.vienmv.model.Product;

public interface ProductDao {
	void insert(Product product);

	void edit(Product product);

	void delete(int id);

	public List<Product> getListByPage(int start, int end);

	Product get(int id);

	List<Product> getAll(int start, int row);

	List<Product> search(String username);
	
	List<Product> seachByCategory(int cate_id);
	
	List<Product> seachByName(String productName);
}
