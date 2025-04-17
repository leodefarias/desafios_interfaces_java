public class Main {
    public static void main(String[] args) {
        SistemaPedagio sistema = new SistemaPedagio();

        Pedagio p1 = new Pedagio("Castelo Branco", 10.0);
        Pedagio p2 = new Pedagio("Imigrantes", 15.0);

        Veiculo carro = new Carro("ABC-1D34");
        Veiculo moto = new Moto("DEF5T78");
        Veiculo caminhao = new Caminhao("GHI9H99", 3);

        sistema.registrarPassagem(carro, p1);
        sistema.registrarPassagem(moto, p1);
        sistema.registrarPassagem(caminhao, p2);

        System.out.println("Veículos no pedágio Castelo Branco:");
        for (Veiculo v : sistema.getVeiculosPorPedagio(p1)) {
            System.out.println("- " + v.getPlaca());
        }

        System.out.println("\nTotal arrecadado em Imigrantes: R$" +
                sistema.getValorTotalArrecadadoPorPedagio(p2));
    }
}
