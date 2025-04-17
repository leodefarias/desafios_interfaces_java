import java.util.ArrayList;
import java.util.List;

public class SistemaPedagio {
    private List<RegistroPassagem> registros = new ArrayList<>();

    public void registrarPassagem(Veiculo veiculo, Pedagio pedagio) {
        RegistroPassagem registro = new RegistroPassagem(veiculo, pedagio);
        registros.add(registro);
    }

    public List<Veiculo> getVeiculosPorPedagio(Pedagio pedagio) {
        List<Veiculo> veiculos = new ArrayList<>();
        for (RegistroPassagem registro : registros) {
            if (registro.getPedagio().getLocalizacao().equals(pedagio.getLocalizacao())) {
                veiculos.add(registro.getVeiculo());
            }
        }
        return veiculos;
    }

    public double getValorTotalArrecadadoPorPedagio(Pedagio pedagio) {
        double total = 0.0;
        for (RegistroPassagem registro : registros) {
            if (registro.getPedagio().getLocalizacao().equals(pedagio.getLocalizacao())) {
                total += registro.getValorCobrado();
            }
        }
        return total;
    }
}
