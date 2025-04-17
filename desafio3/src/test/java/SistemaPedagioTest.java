import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SistemaPedagioTest {

    @Test
    public void testRegistrarPassagem() {
        SistemaPedagio sistema = new SistemaPedagio();
        Pedagio p = new Pedagio("Anchieta", 10.0);
        Veiculo carro = new Carro("XYZ-1234");

        sistema.registrarPassagem(carro, p);
        List<Veiculo> veiculos = sistema.getVeiculosPorPedagio(p);

        assertEquals(1, veiculos.size());
        assertEquals("XYZ-1234", veiculos.get(0).getPlaca());
    }

    @Test
    public void testValorTotalArrecadadoPorPedagio() {
        SistemaPedagio sistema = new SistemaPedagio();
        Pedagio p = new Pedagio("Castelo Branco", 10.0);

        sistema.registrarPassagem(new Carro("AAA-1111"), p);       // 10.0
        sistema.registrarPassagem(new Moto("BBB-2222"), p);        // 5.0
        sistema.registrarPassagem(new Caminhao("CCC-3333", 2), p); // 20.0

        double total = sistema.getValorTotalArrecadadoPorPedagio(p);
        assertEquals(35.0, total);
    }
}
