import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaAcompanhamento implements Relatorio {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void cadastrarAtendimento(String nomePessoa, Atendimento atendimento) {
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nomePessoa)) {
                p.adicionarAtendimento(atendimento);
            }
        }
    }

    public List<Pessoa> filtrarPorTipoDeficiencia(String tipo) {
        return pessoas.stream()
                .filter(p -> p.getTipoDeficiencia().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pessoa> filtrarPorGrauDeficiencia(String grau) {
        return pessoas.stream()
                .filter(p -> p.getGrauDeficiencia().equalsIgnoreCase(grau))
                .collect(Collectors.toList());
    }

    @Override
    public List<Atendimento> gerarRelatorioPorPessoa(String nomePessoa) {
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nomePessoa)) {
                return p.getAtendimentos();
            }
        }
        return new ArrayList<>();
    }
}
