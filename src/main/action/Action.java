package main.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.service.ifac.ClientService;
import main.service.ifac.LogicService;
import main.service.ifac.ProductService;
import main.util.SpringContextsUtil;

public class Action {
	public static void main(String[] args) {
		
		// Constructor-based dependency injection
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "resources/spring.xml" });
		LogicService service00 = (LogicService) context.getBean("logicService00", LogicService.class);
		String info00 = service00.getProductInfo00("ApplicationContext");
		System.out.println("info00:" + info00);
		
		LogicService service01 = (LogicService) SpringContextsUtil.getBean("logicService01", LogicService.class);
		String info01 = service01.getProductInfo01("SpringContextsUtil");
		System.out.println("info01:" + info01);
		
		LogicService service02 = (LogicService) SpringContextsUtil.getBean("logicService02", LogicService.class);
		String info02 = service02.getProductInfo02("SpringContextsUtil");
		System.out.println("info02:" + info02);
		
		LogicService service03 = (LogicService) SpringContextsUtil.getBean("logicService03", LogicService.class);
		String info03 = service03.getProductInfo03("SpringContextsUtil");
		System.out.println("info03:" + info03);
		
		boolean isEquals = service00.equals(service01);
		System.out.println("service Object isEquals: " + isEquals);
		//********************************************************************************
		
		// Setter-based dependency injection
		LogicService service10 = (LogicService) SpringContextsUtil.getBean("logicService10", LogicService.class);
		String info10 = service10.getProductInfo10("SpringContextsUtil");
		System.out.println("info10:" + info10);
		//********************************************************************************
		
		// via the static factory method 
		ClientService clientService = (ClientService) SpringContextsUtil.getBean("clientService", ClientService.class);
		boolean isCreated = clientService.isCreated();
		System.out.println("isCreated:" + isCreated);
		//********************************************************************************
		
		// via the factory bean
		ProductService productService = (ProductService) SpringContextsUtil.getBean("productService", ProductService.class);
		int price = productService.getPrice();
		System.out.println("price:" + price);
		//********************************************************************************
	}
}
