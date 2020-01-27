package pack;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

public static void main(String[] args) {

AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
BeansClass1 obj=(BeansClass1)context.getBean("b");
obj.getMessage();
context.registerShutdownHook();
}

}
