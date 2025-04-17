import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void testCalculoValorCarro() {
        Pedagio p = new Pedagio("Anhanguera", 10.0);
        Carro carro = new Carro("ABC-1234");

        assertEquals(10.0, carro.calcularValor(p));
        assertEquals("ABC-1234", carro.getPlaca());
    }
}
