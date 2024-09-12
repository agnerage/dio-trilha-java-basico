package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o valor do segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            // Chamar o método contido na lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem quando a exceção for lançada
            System.out.println(e.getMessage());
        } finally {
            // Fechar o Scanner no bloco finally para garantir que seja fechado
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é maior que parametroDois e lançar exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}
