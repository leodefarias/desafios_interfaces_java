import java.util.List;

public interface Relatorio {
    List<Atendimento> gerarRelatorioPorPessoa(String nomePessoa);
}
