package main.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.service.ifac.ClientService;
import main.service.ifac.LogicService;
import main.service.ifac.ProductService;
import main.service.ifac.SimpleAccountService;
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
		
		LogicService service04 = (LogicService) SpringContextsUtil.getBean("logicService04", LogicService.class);
		String info04 = service03.getProductInfo04("SpringContextsUtil");
		System.out.println("info04:" + info04);
		
		//********************************************************************************
		
		// Setter-based dependency injection
		LogicService service10 = (LogicService) SpringContextsUtil.getBean("logicService10", LogicService.class);
		String info10 = service10.getProductInfo10("SpringContextsUtil");
		System.out.println("info10:" + info10);
		
		LogicService service11 = (LogicService) SpringContextsUtil.getBean("logicService11", LogicService.class);
		String info11 = service11.getProductInfo10("SpringContextsUtil");
		System.out.println("info11:" + info11);
		
		LogicService service12 = (LogicService) SpringContextsUtil.getBean("logicService12", LogicService.class);
		String info12 = service12.getProductInfo10("SpringContextsUtil");
		System.out.println("info12:" + info12);
		
		LogicService service13 = (LogicService) SpringContextsUtil.getBean("logicService13", LogicService.class);
		String idrefValue = service13.getIdrefValue();
		System.out.println("idrefValue:" + idrefValue);
		
		LogicService service14 = (LogicService) SpringContextsUtil.getBean("logicService14", LogicService.class);
		String info14 = service14.getProductInfo14("SpringContextsUtil");
		System.out.println("info14:" + info14);
//		PropertyPlaceholderConfigurer mappings = (PropertyPlaceholderConfigurer) SpringContextsUtil.getBean("mappings", LogicService.class);
		//********************************************************************************
		
		// via the static factory method 
		ClientService clientService00 = (ClientService) SpringContextsUtil.getBean("clientService00", ClientService.class);
		String clientInfo00 = clientService00.getClientInfo00("SpringContextsUtil");
		System.out.println("clientInfo00:" + clientInfo00);
		
		ClientService clientService01 = (ClientService) SpringContextsUtil.getBean("clientService01", ClientService.class);
		String clientInfo01 = clientService01.getClientInfo01("SpringContextsUtil");
		System.out.println("clientInfo01:" + clientInfo01);
		//********************************************************************************
		
		// via the factory bean
		ProductService productService00 = (ProductService) SpringContextsUtil.getBean("productService00", ProductService.class);
		String productInfo00 = productService00.getProductInfo00("SpringContextsUtil");
		System.out.println("productInfo00:" + productInfo00);
		
		ProductService productService01 = (ProductService) SpringContextsUtil.getBean("productService01", ProductService.class);
		String productInfo01 = productService01.getProductInfo01("SpringContextsUtil");
		System.out.println("productInfo01:" + productInfo01);
		//********************************************************************************
		
		// References to other beans (collaborators)
//		SimpleAccountService accountService = (SimpleAccountService) SpringContextsUtil.getBean("accountService00", ProductService.class);
//		String accInfo = accountService.getAccountInfo00("SpringContextsUtil");
//		int maxLine = accountService.getMaxLine();
//		System.out.println("accInfo:" + accInfo);
//		System.out.println("maxLine:" + maxLine);
		//********************************************************************************
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
