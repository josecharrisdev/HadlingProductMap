package co.edu.uptc.product.service;

import java.util.List;

import co.edu.uptc.product.domain.Product;
import co.edu.uptc.product.repository.ProductRepository;
import co.edu.uptc.product.repository.ProductRepositoryBD;
import co.edu.uptc.product.repository.ProductRepositoryImpl;

/**
 * Nombre de la clase: ProductService
 *
 * <p>[Descripción clara de la responsabilidad de la clase]</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>[Responsabilidad 1]</li>
 *   <li>[Responsabilidad 2]</li>
 * </ul>
 *
 * <p><b>Notas:</b></p>
 * <ul>
 *   <li>[Consideraciones importantes]</li>
 * </ul>
 *
 * @author LENOVO
 * @version 1.0
 * @since 4/05/2026
 */
public class ProductService {
	/**
	 * Atributo que determina 
	 */
	private ProductRepositoryImpl productRepository;
	
	/**
	 * Crea una nueva instancia de ProductService.
	 *
	 * @param productRepository Parámetro que determina la instancia de repository
	 */
	public ProductService(ProductRepositoryImpl productRepository) {
		this.productRepository = new ProductRepositoryImpl();
	}
	
	public Product addProduct(Product product) {
		if(this.productRepository.existById(product.getId())) {
			return null;
		}
		this.productRepository.addProduct(product);
		return product;
	}
	
	public Product findById(Long id) {
		return this.productRepository.findById(id);
	}
	
	public List<Product> findAll(){
		return this.productRepository.findAll();
	}
	
	public Product updateProduct(Long id, String name, Double price) {
		Product product = new Product(id, name, price);
		if( !this.productRepository.existById(id) ) {
			return null;
		}
		return this.productRepository.updateProduct(product);
	}
	
	public boolean deleteProduct(Long id) {
		if( !this.productRepository.existById(id) ) {
			return false;
		}
		this.productRepository.deleteById(id);
		return true;
	}
	
	
}
