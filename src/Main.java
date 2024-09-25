public class Main {
    public static void main(String[] args) {
        FabricaVeiculos fabrica = new FabricaVeiculos();
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos(fabrica);

        try {
            System.out.println("Usando um carro:");
            gerenciador.usarVeiculo("car");

            System.out.println("\nUsando uma moto:");
            gerenciador.usarVeiculo("motorcycle");

            System.out.println("\nTentando usar um veículo desconhecido:");
            gerenciador.usarVeiculo("boat");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
