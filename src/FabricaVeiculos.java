public class FabricaVeiculos {
    public Veiculo criarVeiculo(String tipo) {
        if (tipo.equals("carro")) {
            return new Carro();
        } else if (tipo.equals("motocicleta")) {
            return new Motocicleta();
        } else {
            throw new IllegalArgumentException("Tipo de veículo desconhecido" + tipo);
        }
    }
}
