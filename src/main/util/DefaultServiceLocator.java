package main.util;

import main.service.ifac.ProductService;
import main.service.impl.ProductServiceImpl;

public class DefaultServiceLocator {
	ProductServiceImpl productService = new ProductServiceImpl();

	private DefaultServiceLocator() {
	}

	public ProductService createProductServiceInstance() {
		return productService;
	}
}
