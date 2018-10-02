package services;

import java.util.List;

import entities.Product;

public interface ProductService {
	public void createtProduct(Product product);
	public List<Product> getAllProducts();
}
