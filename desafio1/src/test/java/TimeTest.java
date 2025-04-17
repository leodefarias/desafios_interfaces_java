import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    public void testAdicionarJogadora() {
        Time time = new Time("Estrelas FC", "São Paulo");
        Jogadora jogadora = new Jogadora("Ana", 22, "Atacante", 9);
        time.adicionarJogadora(jogadora);
        List<Jogadora> jogadoras = time.getJogadoras();

        assertEquals(1, jogadoras.size());
        assertEquals("Ana", jogadoras.get(0).getNome());
    }

    @Test
    public void testPontuacaoTime() {
        Time time = new Time("Estrelas FC", "São Paulo");
        time.adicionarPontos(3);
        time.adicionarPontos(1);
        assertEquals(4, time.getPontos());
    }
}
