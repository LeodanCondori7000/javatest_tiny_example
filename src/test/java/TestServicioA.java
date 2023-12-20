import org.junit.Test;
import services.ServicioA;
import services.impl.ServicioAImpl;

//import static junit.framework.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServicioA {

    @Test
    public void testSumar(){
        int a = 2;
        int b = 2;
        ServicioA servicioA = new ServicioAImpl();
        assertEquals(servicioA.sumar(a,b),4);
    }
}
