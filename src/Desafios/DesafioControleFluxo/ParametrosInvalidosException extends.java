package DesafioControleFluxo;

// Criação da exceção personalizada
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}