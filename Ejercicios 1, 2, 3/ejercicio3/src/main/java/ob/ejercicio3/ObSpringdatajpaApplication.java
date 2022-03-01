package ob.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringdatajpaApplication.class, args);

		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("Numero de coches: " + repository.count());

		// Creamos y almacenamos un coche en la base de datos

		// Coche toyota = new Coche(null, "Toyota", "Prius", 2010);
		// repository.save(toyota); opcion ampliada

		repository.save(new Coche(null, "Toyota", "Prius", 2010)); // opcion reducida

		System.out.println("Numero de coches: " + repository.count());

		// Recuperar todos los elementos

		System.out.println(repository.findAll());
	}

}
