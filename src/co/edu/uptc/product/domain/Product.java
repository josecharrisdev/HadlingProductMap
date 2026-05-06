package co.edu.uptc.product.domain;

/**
 * Nombre de la clase: Product
 *
 * <p>Clase del modelo que determina la información de productos</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>Modela la información de los productos que se tienen en inventario</li>
 * </ul>
 *
 * @author jcharris
 * @version 1.0
 * @since 4/05/2026
 */
public class Product {
	/**
	 * Atributo que determina el identificador del producto
	 */
	private Long id;
	
	/**
	 * Atributo que determina el nombre del producto
	 */
	private String name;
	
	/**
	 * Atributo que determina el precio del producto
	 */
	private Double price;
	
	/**
	 * Crea una nueva instancia de Product.
	 */
	public Product() {
		// Constructor vacío
	}

	/**
	 * Crea una nueva instancia de Product.
	 *
	 * @param id		Parámetro que determina el identificador del producto
	 * @param name  	Parámetro que determina el nombre del producto
	 * @param price 	Parámetro que determina el precio del producto
	 */
	public Product(Long id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	/**
	 * Método encargado de retornar el valor de id.
	 *
	 * @return valor de id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Método encargado de establecer el valor de id.
	 *
	 * @param id nuevo valor de id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Método encargado de retornar el valor de name.
	 *
	 * @return valor de name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Método encargado de establecer el valor de name.
	 *
	 * @param name nuevo valor de name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Método encargado de retornar el valor de price.
	 *
	 * @return valor de price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Método encargado de establecer el valor de price.
	 *
	 * @param price nuevo valor de price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
