package main.service.impl;

import java.util.List;
import java.util.Map;

import main.dao.ifac.ConnectDao;
import main.service.ifac.ProductService;

public class ProductServiceImpl implements ProductService {
	private ConnectDao connectDao00;
	
	private ConnectDao connectDao01;
	
	public ProductServiceImpl() {

	}

	public ProductServiceImpl(ConnectDao connectDao) {
		this.connectDao01 = connectDao;
	}

	public String getProductInfo00(String name) {
		String result = null;
    	if(connectDao00 != null) {
    		List<Map<String, Object>> infoList = connectDao00.getInfo();
    		Map<String, Object> infoMap = infoList.get(0);
    		result = copmoseInfo(name, infoMap);
    	}
		return result == null ? "No DATA!" : result; 
	}
	
	public String getProductInfo01(String name) {
		List<Map<String, Object>> infoList = connectDao01.getInfo();
    	Map<String, Object> infoMap = infoList.get(0);
    	return copmoseInfo(name, infoMap); 
	}
	
	private String copmoseInfo(String name , Map<String, Object> infoMap) {
		return "Hi " + name + ", the name is " + infoMap.get("name") + ", phone is " + infoMap.get("phone");  
	}
}
