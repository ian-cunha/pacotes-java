package identidade;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa ivanise = new Pessoa("Ivanise Oliveira", "123.456.789-00");

        ivanise.setEndereco("Rua das Fronteiras");

        System.out.println(ivanise.getNome() + " - " + ivanise.getCpf());
    }
}
