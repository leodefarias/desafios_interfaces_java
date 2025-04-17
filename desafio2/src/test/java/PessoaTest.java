import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PessoaTest {

    @Test
    public void testCriacaoPessoa() {
        Pessoa p = new Pessoa("Ana", 30, "Visual", "Moderado", "Rua A");
        assertEquals("Ana", p.getNome());
        assertEquals(30, p.getIdade());
        assertEquals("Visual", p.getTipoDeficiencia());
        assertEquals("Moderado", p.getGrauDeficiencia());
        assertEquals("Rua A", p.getEndereco());
    }

    @Test
    public void testAdicionarAtendimento() {
        Pessoa p = new Pessoa("João", 40, "Auditiva", "Leve", "Rua B");
        Atendimento a = new Atendimento("2024-04-15", "Fisioterapia", "Dr. Lucas");
        p.adicionarAtendimento(a);

        List<Atendimento> atendimentos = p.getAtendimentos();
        assertEquals(1, atendimentos.size());
        assertEquals("Fisioterapia", atendimentos.get(0).getTipo());
    }
}
