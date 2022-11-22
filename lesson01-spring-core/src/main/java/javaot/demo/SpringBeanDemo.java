package javaot.demo;

import com.sun.security.ntlm.Client;
import javaot.bean.Item;
import javaot.bean.ItemGroup;
import javaot.services.ClientService;
import javaot.utils.ContextUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanDemo {
    private static final String LOCATION = "meta-beans.xml";
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(LOCATION);

        ContextUtils.showBeansName(context);
        	
        ClientService clientService = context.getBean("clientServiceX", ClientService.class);
        clientService.logClient();

        ItemGroup igA = context.getBean("itemGroupA", ItemGroup.class);
        ItemGroup igB1 = context.getBean("itemGroupB", ItemGroup.class);
        ItemGroup igB2 = context.getBean("itemGroupB", ItemGroup.class);
        ItemGroup igC = context.getBean("itemGroupC", ItemGroup.class);

        System.out.println("igA ==> " + igA);
        System.out.println("igB1 ==> " + igB1);
        System.out.println("igB2 ==> " + igB2);
        System.out.println("igC ==> " + igC);

        System.out.println("igB1 hashcode: " + System.identityHashCode(igB1));
        System.out.println("igB2 hashcode: " + System.identityHashCode(igB2));

        Item itA = context.getBean("itemA", Item.class);
        System.out.println("itA ==> " + itA);

        context.close();
    }
}
