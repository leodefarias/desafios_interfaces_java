public class Main {
    public static void main(String[] args) {
        SistemaAcompanhamento sistema = new SistemaAcompanhamento();

        Pessoa p1 = new Pessoa("Ana", 30, "Visual", "Moderado", "Rua A");
        Pessoa p2 = new Pessoa("João", 40, "Auditiva", "Leve", "Rua B");

        sistema.cadastrarPessoa(p1);
        sistema.cadastrarPessoa(p2);

        sistema.cadastrarAtendimento("Ana", new Atendimento("2024-04-10", "Fisioterapia", "Dr. Paulo"));
        sistema.cadastrarAtendimento("Ana", new Atendimento("2024-04-15", "Psicologia", "Dra. Rita"));

        sistema.cadastrarAtendimento("João", new Atendimento("2024-04-12", "Terapia Ocupacional", "Dr. Hugo"));

        System.out.println("Relatório de Ana:");
        for (Atendimento a : sistema.gerarRelatorioPorPessoa("Ana")) {
            System.out.println(a.getData() + " - " + a.getTipo() + " - " + a.getProfissionalResponsavel());
        }
    }
}
