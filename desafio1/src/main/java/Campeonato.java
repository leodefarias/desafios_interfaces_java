import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Campeonato {
    private List<Time> times = new ArrayList<>();
    private List<Partida> partidas = new ArrayList<>();

    public void adicionarTime(Time time) {
        times.add(time);
    }

    public void adicionarPartida(Partida partida) {
        partidas.add(partida);
        partida.calcularResultado();
    }

    public List<Time> getClassificacao() {
        List<Time> classificados = new ArrayList<>(times);
        classificados.sort(Comparator.comparingInt(Time::getPontos).reversed());
        return classificados;
    }

    public void exibirClassificacao() {
        System.out.println("\nTabela de Classificação:");
        int posicao = 1;
        for (Time time : getClassificacao()) {
            System.out.println(posicao + "º - " + time.getNome() + " (" + time.getPontos() + " pontos)");
            posicao++;
        }
    }
}
