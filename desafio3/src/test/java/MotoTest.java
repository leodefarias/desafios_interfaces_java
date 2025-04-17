import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotoTest {

    @Test
    public void testCalculoValorMoto() {
        Pedagio p = new Pedagio("Bandeirantes", 12.0);
        Moto moto = new Moto("DEF-5678");

        assertEquals(6.0, moto.calcularValor(p));
        assertEquals("DEF-5678", moto.getPlaca());
    }
}
