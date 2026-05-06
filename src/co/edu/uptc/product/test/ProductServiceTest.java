package co.edu.uptc.product.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uptc.product.domain.Product;
import co.edu.uptc.product.repository.ProductRepositoryImpl;
import co.edu.uptc.product.service.ProductService;

class ProductServiceTest {
	
	private ProductService productService;

	@BeforeEach
	public void init() {
		this.productService = new ProductService(new ProductRepositoryImpl());
	}

	@Test
	void testMethodAddProductSuccessful() {
		/* Creación de los datos requeridos para la prueba */
		Product product1 = new Product(1L, "Producto 1", 1200d);
		Product productCreated = this.productService.addProduct(product1);
		
		Assert.assertEquals(product1, productCreated);
	}
	
	@Test
	void testMethodAddProductFailed() {
		/* Creación de los datos requeridos para la prueba */
		Product product1 = new Product(1L, "Producto 1", 1200d);
		Product product2 = new Product(1L, "Producto 1", 1200d);
		this.productService.addProduct(product1);
		Product productCreated2 = this.productService.addProduct(product2);
		Assert.assertNull(productCreated2);
	}

}
