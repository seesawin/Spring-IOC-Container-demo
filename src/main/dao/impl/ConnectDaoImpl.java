package main.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.dao.ifac.ConnectDao;

public class ConnectDaoImpl implements ConnectDao{
	
	public List<Map<String, Object>> getInfo() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("name", "Robert");
		resultMap.put("phone", "0912345678");
		
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		resultList.add(resultMap);
		
		return resultList;
	}

}
