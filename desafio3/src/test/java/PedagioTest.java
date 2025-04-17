import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedagioTest {

    @Test
    public void testCriacaoPedagio() {
        Pedagio p = new Pedagio("Castelo Branco", 12.5);
        assertEquals("Castelo Branco", p.getLocalizacao());
        assertEquals(12.5, p.getTarifaBase());
    }
}
