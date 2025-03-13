package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno ian = new Aluno();

        ian.setNome("Ian M. da Cunha");
        ian.setIdade(25);

        System.out.println("O aluno " + ian.getNome() + " tem " + ian.getIdade() + " anos.");
    }
}
