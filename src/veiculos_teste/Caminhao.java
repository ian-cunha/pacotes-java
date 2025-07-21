package veiculos_teste;

public class Caminhao extends Veiculo {
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Caminhão ligado");
    }

    private void confereCombustivel() {
        System.out.println("Confere combustível");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }
}
