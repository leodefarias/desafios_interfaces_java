import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SistemaAcompanhamentoTest {

    @Test
    public void testCadastroPessoaEFiltragem() {
        SistemaAcompanhamento sistema = new SistemaAcompanhamento();
        Pessoa p1 = new Pessoa("Ana", 30, "Visual", "Moderado", "Rua A");
        Pessoa p2 = new Pessoa("João", 40, "Auditiva", "Leve", "Rua B");

        sistema.cadastrarPessoa(p1);
        sistema.cadastrarPessoa(p2);

        List<Pessoa> visuais = sistema.filtrarPorTipoDeficiencia("Visual");
        assertEquals(1, visuais.size());
        assertEquals("Ana", visuais.get(0).getNome());

        List<Pessoa> leves = sistema.filtrarPorGrauDeficiencia("Leve");
        assertEquals(1, leves.size());
        assertEquals("João", leves.get(0).getNome());
    }

    @Test
    public void testGerarRelatorioPorPessoa() {
        SistemaAcompanhamento sistema = new SistemaAcompanhamento();
        Pessoa p = new Pessoa("Ana", 30, "Visual", "Moderado", "Rua A");
        Atendimento a1 = new Atendimento("2024-04-10", "Fisioterapia", "Dr. Paulo");
        Atendimento a2 = new Atendimento("2024-04-15", "Psicologia", "Dra. Rita");

        sistema.cadastrarPessoa(p);
        sistema.cadastrarAtendimento("Ana", a1);
        sistema.cadastrarAtendimento("Ana", a2);

        List<Atendimento> relatorio = sistema.gerarRelatorioPorPessoa("Ana");
        assertEquals(2, relatorio.size());
        assertEquals("Fisioterapia", relatorio.get(0).getTipo());
        assertEquals("Psicologia", relatorio.get(1).getTipo());
    }
}
