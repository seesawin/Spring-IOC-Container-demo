package main.service.impl;

import java.beans.ConstructorProperties;
import java.util.List;
import java.util.Map;

import main.dao.ifac.ConnectDao;
import main.service.ifac.LogicService;

public class LogicServiceImpl implements LogicService{
	
	private ConnectDao connectDaoConstructor;
	private ConnectDao connectDaoSetter;
	private String idref;
	
	public LogicServiceImpl() {
	}
	
	// Constructor-based dependency injection
	public LogicServiceImpl(ConnectDao connectDao) {
		this.connectDaoConstructor = connectDao;
	}
	
	public LogicServiceImpl(ConnectDao connectDao, int i, String str) {
		this.connectDaoConstructor = connectDao;
	}
	
	public LogicServiceImpl(int i, String str, ConnectDao connectDao) {
		this.connectDaoConstructor = connectDao;
	}
	
	@ConstructorProperties({"dao", "b"})
	public LogicServiceImpl(ConnectDao connectDao, boolean b) {
		this.connectDaoConstructor = connectDao;
	}
	//********************************************************************************
	
	// Setter-based dependency injection
	public void setConnectDao(ConnectDao connectDao0) {
		this.connectDaoSetter = connectDao0;
	}
	public ConnectDao getConnectDao() {
		return this.connectDaoSetter;
	}
	public void setIdref(String idref) {
		this.idref = idref;
	}
	//********************************************************************************
	
	public String getProductInfo00(String name) {
		List<Map<String, Object>> infoList = connectDaoConstructor.getInfo();
		Map<String, Object> infoMap = infoList.get(0);
		return copmoseInfo(name, infoMap); 
	}
	
	public String getProductInfo01(String name) {
		List<Map<String, Object>> infoList = connectDaoConstructor.getInfo();
		Map<String, Object> infoMap = infoList.get(0);
		return copmoseInfo(name, infoMap); 
	}
	
	public String getProductInfo02(String name) {
		List<Map<String, Object>> infoList = connectDaoConstructor.getInfo();
		Map<String, Object> infoMap = infoList.get(0);
		return copmoseInfo(name, infoMap); 
	}
	
	public String getProductInfo03(String name) {
		List<Map<String, Object>> infoList = connectDaoConstructor.getInfo();
		Map<String, Object> infoMap = infoList.get(0);
		return copmoseInfo(name, infoMap); 
	}
	
	public String getProductInfo04(String name) {
		List<Map<String, Object>> infoList = connectDaoConstructor.getInfo();
		Map<String, Object> infoMap = infoList.get(0);
		return copmoseInfo(name, infoMap); 
	}
	
	public String getProductInfo10(String name) {
		List<Map<String, Object>> infoList = connectDaoSetter.getInfo();
		Map<String, Object> infoMap = infoList.get(0);
		return copmoseInfo(name, infoMap); 
	}
	
	public String getProductInfo14(String name) {
		return connectDaoSetter.getInnerBeanInfo(name); 
	}
	
	private String copmoseInfo(String name , Map<String, Object> infoMap) {
		return "Hi " + name + ", the name is " + infoMap.get("name") + ", phone is " + infoMap.get("phone");  
	}
	
	public String getIdrefValue() {
		return this.idref;
	}
	
	public void close() {
		System.out.println("close!");
	}
	
	public String testInfo() {
		return "bean is created!";
	}

}
