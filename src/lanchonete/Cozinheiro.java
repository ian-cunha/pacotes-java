package lanchonete;

public class Cozinheiro {
    // Pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
    }

    // Pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    // Pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
    }

    public void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }

    public void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO A FRUTA, LEITE E SUCO");
    }

    public void lavarIngredientes() {
        System.out.println("LAVANDO OS INGREDIENTES");
    }

    public void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    public void fritarIngredientesLanche() {
        System.out.println("FRITANDO CARNE E OVO PARA HAMBURGER");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
