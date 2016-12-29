package main.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.service.ifac.LogicService;
import main.util.SpringContextsUtil;

public class Action {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "resources/spring.xml" });
		LogicService service1 = (LogicService) context.getBean("logicService0", LogicService.class);
		String info1 = service1.getProductInfo("ApplicationContext");
		System.out.println(info1);
		
		// resource form https://my.oschina.net/u/225084/blog/167842
		LogicService service2 = (LogicService) SpringContextsUtil.getBean("logicService0", LogicService.class);
		String info2 = service2.getProductInfo("SpringContextsUtil");
		System.out.println(info2);
	}
}
