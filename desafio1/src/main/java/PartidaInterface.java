public interface PartidaInterface {
    void registrarPlacar(int golsTimeA, int golsTimeB);
    void calcularResultado();
    Time getTimeA();
    Time getTimeB();
    int getGolsTimeA();
    int getGolsTimeB();
}
