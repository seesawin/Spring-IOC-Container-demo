package main.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.dao.ifac.ConnectDao;

public class ConnectDaoImpl implements ConnectDao{
	
	public String name;
	
	public String age;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<Map<String, Object>> getInfo() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("name", "Robert");
		resultMap.put("phone", "0912345678");
		
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		resultList.add(resultMap);
		
		return resultList;
	}
	
	public String getInnerBeanInfo(String name) {
		return "Hi " + name + ", the name:" + this.name + ", age:" + age;
	}

}
