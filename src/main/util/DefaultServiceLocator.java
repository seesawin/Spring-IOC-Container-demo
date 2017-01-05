package main.util;

import main.dao.ifac.ConnectDao;
import main.service.ifac.ProductService;
import main.service.impl.ProductServiceImpl;

public class DefaultServiceLocator {

	private DefaultServiceLocator() {
	}

	public ProductService createProductServiceInstance() {
		ProductService productService = new ProductServiceImpl();
		return productService;
	}
	
	public ProductService createProductServiceInstance(ConnectDao connectDao) {
		ProductService productService = new ProductServiceImpl(connectDao);
		return productService;
	}
}
