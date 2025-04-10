package messenger.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    // Somente os filhos podem chamar este método
    protected void validarConectadoInternet() {
        System.out.println("Validando conexão com a internet...");
    }
}
