package main.service.ifac;

import main.service.impl.ClientServiceImpl;

public interface ClientService {
	public static ClientServiceImpl createInstance() {
		return null;
	}

	public boolean isCreated();
}
