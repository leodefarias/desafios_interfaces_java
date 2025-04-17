public class Main {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();

        Time time1 = new Time("Estrelas FC", "São Paulo");
        Time time2 = new Time("Guerreiras do Sul", "Curitiba");

        time1.adicionarJogadora(new Jogadora("Ana", 22, "Atacante", 9));
        time1.adicionarJogadora(new Jogadora("Bruna", 24, "Goleira", 1));

        time2.adicionarJogadora(new Jogadora("Camila", 21, "Meio-campo", 8));
        time2.adicionarJogadora(new Jogadora("Daniela", 25, "Zagueira", 4));

        campeonato.adicionarTime(time1);
        campeonato.adicionarTime(time2);

        Partida partida1 = new Partida(time1, time2);
        partida1.registrarPlacar(2, 2); // Empate
        campeonato.adicionarPartida(partida1);

        Partida partida2 = new Partida(time1, time2);
        partida2.registrarPlacar(1, 0); // Vitória do time1
        campeonato.adicionarPartida(partida2);

        campeonato.exibirClassificacao();
    }
}
