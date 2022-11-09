package javaot.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javaot.bean.Item;
import javaot.bean.ItemGroup;
import javaot.utils.ContextUtils;
import service.ClientService;

public class SpringBeanDemo {

	private static final String LOCATION = "meta-beans.xml";

	public static void main(String[] args) {
		// context --> spring ioc(core) container
		// ClassPathXmlApplicationContext(BeanFactory) --> read xml file from class path
		// initial
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(LOCATION);
		ContextUtils.showBeansName(context);
		
		
		System.out.println("========================");
		
		ClientService clientService = context.getBean("clientF", ClientService.class);
		clientService.test();
		
		System.out.println("========================");
		
		Item item = context.getBean("item", Item.class);
		System.out.println("item ===> " + item);
		
		System.out.println("========================");
		
		ItemGroup igA = context.getBean("itemGroupA", ItemGroup.class);
		ItemGroup igB1 = context.getBean("itemGroupB", ItemGroup.class);
		ItemGroup igB2 = context.getBean("itemGroupB", ItemGroup.class);
		ItemGroup igC = context.getBean("itemGroupC", ItemGroup.class);
		
		System.out.println("igA ==> " + igA);
		System.out.println("igB1 ==> " + igB1);
		System.out.println("igB2 ==> " + igB2);
		System.out.println("igC ==> " + igC);
		
		// scope-default: singleton
		System.out.println("igB1 hashcode ==> " + System.identityHashCode(igB1));
		System.out.println("igB2 hashcode ==> " + System.identityHashCode(igB2));
		
		context.close();
		// destroy
	}
}
