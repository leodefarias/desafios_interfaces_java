import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartidaTest {

    @Test
    public void testResultadoEmpate() {
        Time timeA = new Time("Time A", "Cidade A");
        Time timeB = new Time("Time B", "Cidade B");
        Partida partida = new Partida(timeA, timeB);
        partida.registrarPlacar(1, 1);
        partida.calcularResultado();

        assertEquals(1, timeA.getPontos());
        assertEquals(1, timeB.getPontos());
    }

    @Test
    public void testResultadoVitoriaTimeA() {
        Time timeA = new Time("Time A", "Cidade A");
        Time timeB = new Time("Time B", "Cidade B");
        Partida partida = new Partida(timeA, timeB);
        partida.registrarPlacar(3, 1);
        partida.calcularResultado();

        assertEquals(3, timeA.getPontos());
        assertEquals(0, timeB.getPontos());
    }
}
