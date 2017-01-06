package main.service.impl;

import java.util.List;
import java.util.Map;

import main.dao.ifac.ConnectDao;
import main.service.ifac.SimpleAccountService;

public class SimpleAccountServiceImpl implements SimpleAccountService{
	
	private ConnectDao connectDao;
	
	private int maxLine;
	
	public SimpleAccountServiceImpl(ConnectDao connectDao) {
		this.connectDao = connectDao;
	}
	
	public void setMaxLine(int maxLine) {
		this.maxLine = maxLine;
	}

	public String getAccountInfo00(String name) {
		List<Map<String, Object>> infoList = connectDao.getInfo();
		Map<String, Object> infoMap = infoList.get(0);
		return copmoseInfo(name, infoMap); 
	}
	
	private String copmoseInfo(String name , Map<String, Object> infoMap) {
		return "Hi " + name + ", the name is " + infoMap.get("name") + ", phone is " + infoMap.get("phone");  
	}

	public int getMaxLine() {
		return maxLine;
	}

}
