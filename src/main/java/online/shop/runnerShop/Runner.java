package online.shop.runnerShop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("jdbctemplate-config.xml");
    }
}
