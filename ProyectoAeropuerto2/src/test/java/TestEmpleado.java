import dominio.Empleado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEmpleado {

    @Test
    public void Adde(){
        Empleado e01= new Empleado ("Yamil", 25.5);
        Empleado e02= new Empleado ("Jose", 35.5);
        Empleado e03= new Empleado("Champi", 25.0);


        assertEquals("Yamil", e01.getNombre());
        assertEquals("Jose", e02.getNombre());
        assertEquals("Champi", e03.getNombre());
    }
}
