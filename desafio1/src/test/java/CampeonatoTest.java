import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CampeonatoTest {

    @Test
    public void testClassificacao() {
        Campeonato campeonato = new Campeonato();
        Time time1 = new Time("Time 1", "Cidade 1");
        Time time2 = new Time("Time 2", "Cidade 2");

        time1.adicionarPontos(3);
        time2.adicionarPontos(1);

        campeonato.adicionarTime(time1);
        campeonato.adicionarTime(time2);

        List<Time> classificacao = campeonato.getClassificacao();
        assertEquals("Time 1", classificacao.get(0).getNome());
        assertEquals("Time 2", classificacao.get(1).getNome());
    }
}
