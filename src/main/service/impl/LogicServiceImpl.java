package main.service.impl;

import java.util.List;
import java.util.Map;

import main.dao.ifac.ConnectDao;
import main.service.ifac.LogicService;

public class LogicServiceImpl implements LogicService{
	
	private ConnectDao connectDao;
	private ConnectDao dataGetter;
	private ConnectDao dataFinder;
	
	public void setConnectDao(ConnectDao connectDao) {
		this.connectDao = connectDao;
	}

	public void setDataGetter(ConnectDao dataGetter) {
		this.dataGetter = dataGetter;
	}

	public void setDataFinder(ConnectDao dataFinder) {
		this.dataFinder = dataFinder;
	}

	public String getProductInfo(String name) {
		List<Map<String, Object>> infoList = connectDao.getInfo();
		Map<String, Object> infoMap = infoList.get(0);
		return "Hi " + name + ", the name is " + infoMap.get("name") + ", phone is " + infoMap.get("phone"); 
	}
	
}
