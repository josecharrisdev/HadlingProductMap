package co.edu.uptc.product.repository;

import java.util.List;

import co.edu.uptc.product.domain.Product;

public interface ProductRepository {
	public Product addProduct(Product product);
	public Product findById(Long id);
	public List<Product> findAll();
	public Product updateProduct(Product newProduct);
	public void deleteById(Long id);
	public boolean existById(Long id);
}
