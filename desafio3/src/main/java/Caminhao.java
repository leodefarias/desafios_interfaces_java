public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int eixos) {
        super(placa);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public double calcularValor(Pedagio pedagio) {
        return pedagio.getTarifaBase() * eixos;
    }
}
