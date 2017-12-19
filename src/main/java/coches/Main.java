package coches;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext appContex = new ClassPathXmlApplicationContext("contexto-bean.xml");

		Conductor conductor = (Conductor) appContex.getBean("Conductor");
		System.out.println(conductor.toString());

	}

}
