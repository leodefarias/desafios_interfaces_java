public class Pedagio {
    private String localizacao;
    private double tarifaBase;

    public Pedagio(String localizacao, double tarifaBase) {
        this.localizacao = localizacao;
        this.tarifaBase = tarifaBase;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }
}
