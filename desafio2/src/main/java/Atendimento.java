public class Atendimento {
    private String data;
    private String tipo;
    private String profissionalResponsavel;

    public Atendimento(String data, String tipo, String profissionalResponsavel) {
        this.data = data;
        this.tipo = tipo;
        this.profissionalResponsavel = profissionalResponsavel;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProfissionalResponsavel() {
        return profissionalResponsavel;
    }
}
