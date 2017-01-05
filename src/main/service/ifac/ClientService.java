package main.service.ifac;

import main.service.impl.ClientServiceImpl;

public interface ClientService {
	public static ClientServiceImpl createInstance() {
		return null;
	}

	public boolean isCreated();

	public String getClientInfo00(String name);

	public String getClientInfo01(String name);
}
