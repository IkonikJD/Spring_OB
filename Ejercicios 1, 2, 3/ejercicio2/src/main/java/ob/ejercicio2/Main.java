package ob.ejercicio2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		NotificationService usuario = (NotificationService) context.getBean("userService");

		System.out.println(usuario.imprimirSaludo());

	}

}
