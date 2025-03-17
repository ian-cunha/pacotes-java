package veiculos_teste;

public class Carro extends Veiculo {
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("Confere combustível");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }
}
