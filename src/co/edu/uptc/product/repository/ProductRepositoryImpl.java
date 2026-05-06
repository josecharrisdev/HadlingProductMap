package co.edu.uptc.product.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import co.edu.uptc.product.domain.Product;


/**
 * Nombre de la clase: ProductRepositoryImpl
 *
 * <p>Clase que determina las operaciones sobre la estructrura de dato</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>Administrar información de producto</li>
 * </ul>
 *
 * @author jcharris
 * @version 1.0
 * @since 6/05/2026
 */
public class ProductRepositoryImpl implements ProductRepository {
	private Map<Long, Product> mapProducts;
	private Set<String> emails;
	
	public ProductRepositoryImpl() {
		this.mapProducts = new HashMap<>();
	}
	
	@Override
	public Product addProduct(Product product) {
		this.mapProducts.put(product.getId(), product);
		return product;
	}
	
	public boolean addEmail(String email) {
		return this.emails.add(email);
	}
	
	@Override
	public Product findById(Long id) {
		return this.mapProducts.get(id);
	}
	
	@Override
	public List<Product> findAll(){
		return new ArrayList<Product>(this.mapProducts.values());
	}
	
	@Override
	public Product updateProduct(Product newProduct) {
		this.mapProducts.replace(newProduct.getId(), newProduct);
		return newProduct;
	}
	
	@Override
	public void deleteById(Long id) {
		this.mapProducts.remove(id);
	}
	
	@Override
	public boolean existById(Long id) {
		return this.mapProducts.containsKey(id);
	}
	

}
