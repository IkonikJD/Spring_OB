package ob.ejercicio1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Saludo texto = (Saludo) context.getBean("saludo");

		String mensaje = texto.imprimirSaludo();

		System.out.println(mensaje);

	}

}
