public class Moto extends Veiculo {

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double calcularValor(Pedagio pedagio) {
        return pedagio.getTarifaBase() * 0.5;
    }
}
