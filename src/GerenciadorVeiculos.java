public class GerenciadorVeiculos {
    private final FabricaVeiculos fabricaVeiculos; 
    
    public GerenciadorVeiculos(FabricaVeiculos fabricaVeiculos) {
        this.fabricaVeiculos = fabricaVeiculos;
    }

    public void usarVeiculo(String tipo) {
        Veiculo veiculo = fabricaVeiculos.criarVeiculo(tipo);
        veiculo.ligar();
        veiculo.desligar();
    }
}
