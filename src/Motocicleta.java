public class Motocicleta implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Motocicleta ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Motocicleta desligada");
    }
}
