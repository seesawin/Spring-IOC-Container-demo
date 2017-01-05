package main.service.impl;

import java.util.List;
import java.util.Map;

import main.dao.ifac.ConnectDao;
import main.service.ifac.ClientService;

public class ClientServiceImpl implements ClientService{
	private static ClientServiceImpl clientService0;
	
	private static ClientServiceImpl clientService1;
	
	private ConnectDao connectDao00;
	
	private ConnectDao connectDao01;

	private ClientServiceImpl() {
	}
	
	private ClientServiceImpl(ConnectDao connectDao01) {
		this.connectDao01 = connectDao01;
	}
	
    public static ClientService createInstance() {
    	if(clientService0 == null) {
    		clientService0 = new ClientServiceImpl();
    	}
        return clientService0;
    }
    
	public static ClientService createInstance(ConnectDao connectDao) {
		if(clientService1 == null) {
			clientService1 = new ClientServiceImpl(connectDao);
    	}
		return clientService1;
	}
    
    public boolean isCreated() {
    	boolean result = false;
    	if(clientService0 != null) {
    		result = true;
    	}
    	return result;
    }
    
    public String getClientInfo00(String name) {
    	String result = null;
    	if(connectDao00 != null) {
    		List<Map<String, Object>> infoList = connectDao00.getInfo();
    		Map<String, Object> infoMap = infoList.get(0);
    		result = copmoseInfo(name, infoMap);
    	}
		return result == null ? "No DATA!" : result; 
	}
    
    public String getClientInfo01(String name) {
    	List<Map<String, Object>> infoList = connectDao01.getInfo();
    	Map<String, Object> infoMap = infoList.get(0);
    	return copmoseInfo(name, infoMap); 
    }
    
    private String copmoseInfo(String name , Map<String, Object> infoMap) {
		return "Hi " + name + ", the name is " + infoMap.get("name") + ", phone is " + infoMap.get("phone");  
	}
}
