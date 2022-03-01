package ob.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public String imprimirSaludo() {
        return "\n¡ Bienvenido !";
    }

}
