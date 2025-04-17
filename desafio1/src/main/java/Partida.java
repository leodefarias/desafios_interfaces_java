public class Partida implements PartidaInterface {
    private Time timeA;
    private Time timeB;
    private int golsTimeA;
    private int golsTimeB;

    public Partida(Time timeA, Time timeB) {
        this.timeA = timeA;
        this.timeB = timeB;
    }

    @Override
    public void registrarPlacar(int golsTimeA, int golsTimeB) {
        this.golsTimeA = golsTimeA;
        this.golsTimeB = golsTimeB;
    }

    @Override
    public void calcularResultado() {
        if (golsTimeA > golsTimeB) {
            timeA.adicionarPontos(3);
        } else if (golsTimeB > golsTimeA) {
            timeB.adicionarPontos(3);
        } else {
            timeA.adicionarPontos(1);
            timeB.adicionarPontos(1);
        }
    }

    @Override
    public Time getTimeA() {
        return timeA;
    }

    @Override
    public Time getTimeB() {
        return timeB;
    }

    @Override
    public int getGolsTimeA() {
        return golsTimeA;
    }

    @Override
    public int getGolsTimeB() {
        return golsTimeB;
    }
}
