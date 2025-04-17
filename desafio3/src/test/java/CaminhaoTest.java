import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaminhaoTest {

    @Test
    public void testCalculoValorCaminhao() {
        Pedagio p = new Pedagio("Imigrantes", 15.0);
        Caminhao caminhao = new Caminhao("GHI-9999", 3);

        assertEquals(45.0, caminhao.calcularValor(p));
        assertEquals("GHI-9999", caminhao.getPlaca());
        assertEquals(3, caminhao.getEixos());
    }
}
