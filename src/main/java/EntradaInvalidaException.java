public class EntradaInvalidaException extends RuntimeException {

    // Exceção personalizada para dados inválidos.
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}