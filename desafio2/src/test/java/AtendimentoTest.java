import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtendimentoTest {

    @Test
    public void testCriacaoAtendimento() {
        Atendimento atendimento = new Atendimento("2024-04-15", "Fisioterapia", "Dr. Lucas");

        assertEquals("2024-04-15", atendimento.getData());
        assertEquals("Fisioterapia", atendimento.getTipo());
        assertEquals("Dr. Lucas", atendimento.getProfissionalResponsavel());
    }
}
