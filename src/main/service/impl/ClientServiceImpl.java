package main.service.impl;

import main.service.ifac.ClientService;

public class ClientServiceImpl implements ClientService{
	private static ClientServiceImpl clientService;

	private ClientServiceImpl() {
	}

    public static ClientServiceImpl createInstance() {
    	if(clientService == null) {
    		clientService = new ClientServiceImpl();
    	}
        return clientService;
    }
    
    public boolean isCreated() {
    	boolean result = false;
    	if(clientService != null) {
    		result = true;
    	}
    	return result;
    }
}
