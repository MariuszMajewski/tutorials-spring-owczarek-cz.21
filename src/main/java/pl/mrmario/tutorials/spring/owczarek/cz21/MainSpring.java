package pl.mrmario.tutorials.spring.owczarek.cz21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrMario108
 *
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		DatabaseRepository database = context.getBean("database", DatabaseRepository.class);
		System.out.println(database);
		
	}
}