public abstract class Veiculo implements Calculavel {
    protected String placa;

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public abstract double calcularValor(Pedagio pedagio);
}
