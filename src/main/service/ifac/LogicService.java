package main.service.ifac;

import main.dao.ifac.ConnectDao;

public interface LogicService {
	public String getProductInfo00(String name);

	public String getProductInfo01(String name);

	public String getProductInfo02(String name);

	public String getProductInfo03(String name);

	public String getProductInfo04(String name);

	public String getProductInfo10(String name);
	
	public String getProductInfo14(String name);
	
	public String getIdrefValue();
	
	public void close();
	
	public ConnectDao getConnectDao();
	
	public String testInfo();

}
