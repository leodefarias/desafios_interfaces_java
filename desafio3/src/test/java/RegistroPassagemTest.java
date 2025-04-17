import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistroPassagemTest {

    @Test
    public void testCriacaoRegistroPassagem() {
        Veiculo carro = new Carro("JKL-0000");
        Pedagio p = new Pedagio("Raposo Tavares", 8.0);
        RegistroPassagem registro = new RegistroPassagem(carro, p);

        assertEquals(carro, registro.getVeiculo());
        assertEquals(p, registro.getPedagio());
        assertEquals(8.0, registro.getValorCobrado());
    }
}
