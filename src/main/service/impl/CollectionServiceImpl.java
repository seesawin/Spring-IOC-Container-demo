package main.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import main.service.ifac.CollectionService;

public class CollectionServiceImpl implements CollectionService{
	private Properties adminEmails;
	
	private List<Object> someList;
	
	private Map<String, Object> someMap;

	private Set<Float>  someSet;
	
	private Set<String> nullSet;
	
	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}

	public void setSomeList(List<Object> someList) {
		this.someList = someList;
	}

	public void setSomeMap(Map<String, Object> someMap) {
		this.someMap = someMap;
	}

	public void setSomeSet(Set<Float>  someSet) {
		this.someSet = someSet;
	}
	
	public void setNullSet(Set<String> nullSet) {
		this.nullSet = nullSet;
	}

	public String getPropertiesInfo() {
		String result = "Info: ";
		if(adminEmails != null) {
			result += adminEmails.get("administrator") + ", ";
			result += adminEmails.get("support") + ", ";
			result += adminEmails.get("development") + ", ";
			result += adminEmails.get("sales") + ", ";
			result += adminEmails.get("support");
		}
		return result;
	}

	public String getListInfo() {
		String result = "Info: ";
		if(someList != null && !someList.isEmpty()) {
			for(Object obj : someList) {
				result += obj + ", ";
			}
		}
		return result;
	}

	public String getMapInfo() {
		String result = "Info: ";
		if(someMap != null) {
			result += someMap.get("an entry") + ", ";
			result += someMap.get("a ref") + " ";
		}
		return result;
	}

	public String getSetInfo() {
		String result = "Info: ";
		if(someSet != null && !someSet.isEmpty()) {
			for(Object obj : someSet) {
				result += obj + ", ";
			}
		}
		return result;
	}
	
	public String getNullSet() {
		String result = this.nullSet == null ? "It's null." : "Not null.";
		return result;
	}

}
