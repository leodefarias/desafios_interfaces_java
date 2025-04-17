import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogadoraTest {

    @Test
    public void testCriacaoJogadora() {
        Jogadora jogadora = new Jogadora("Ana", 22, "Atacante", 9);
        assertEquals("Ana", jogadora.getNome());
        assertEquals(22, jogadora.getIdade());
        assertEquals("Atacante", jogadora.getPosicao());
        assertEquals(9, jogadora.getNumeroCamisa());
    }

    @Test
    public void testSettersJogadora() {
        Jogadora jogadora = new Jogadora("Ana", 22, "Atacante", 9);
        jogadora.setNome("Bruna");
        jogadora.setIdade(25);
        jogadora.setPosicao("Meio-campo");
        jogadora.setNumeroCamisa(10);

        assertEquals("Bruna", jogadora.getNome());
        assertEquals(25, jogadora.getIdade());
        assertEquals("Meio-campo", jogadora.getPosicao());
        assertEquals(10, jogadora.getNumeroCamisa());
    }
}
