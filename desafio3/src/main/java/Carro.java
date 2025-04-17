public class Carro extends Veiculo {

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public double calcularValor(Pedagio pedagio) {
        return pedagio.getTarifaBase();
    }
}
