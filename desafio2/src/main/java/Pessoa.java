import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String tipoDeficiencia;
    private String grauDeficiencia;
    private String endereco;
    private List<Atendimento> atendimentos = new ArrayList<>();

    public Pessoa(String nome, int idade, String tipoDeficiencia, String grauDeficiencia, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grauDeficiencia = grauDeficiencia;
        this.endereco = endereco;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public String getGrauDeficiencia() {
        return grauDeficiencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}
