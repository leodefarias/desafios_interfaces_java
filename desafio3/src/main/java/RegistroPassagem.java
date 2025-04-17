public class RegistroPassagem {
    private Veiculo veiculo;
    private Pedagio pedagio;
    private double valorCobrado;

    public RegistroPassagem(Veiculo veiculo, Pedagio pedagio) {
        this.veiculo = veiculo;
        this.pedagio = pedagio;
        this.valorCobrado = veiculo.calcularValor(pedagio);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Pedagio getPedagio() {
        return pedagio;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }
}
